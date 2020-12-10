{- Diego Maia, Guilherme Silva
  Programa que simula um sistema de compras -}
 
type NomeProduto = String
type Quantidade = Int 
type Preco = Int 
type Produto = (NomeProduto, Preco, Quantidade)
type Estoque = [Produto]


estoque = [("monitor", 500, 10), ("telefone", 150, 50), ("teclado", 70, 30), ("mouse", 50, 50)]
carrinho = [("monitor", 500, 5), ("teclado", 20, 1), ("notebook", 1000, 2), ("celular", 150, 20), ("mouse", 50, 2)] 

get_nome (n, _, _) = n
get_preco (_, p, _) = p
get_quantidade (_, _, q) = q


-- retorna uma lista de preços menores que 100    
menores_precos estoque = filter (<100) (map(get_preco) estoque) 

-- recebe a lista menores_precos e estoque, compara com o preço do estoque e retorna uma tupla com o respectivo nome e o preço
produtos_baratos [] _ = []
produtos_baratos (x:xs) (y:ys) | (x == get_preco y) = [(get_nome y, x)] ++ produtos_baratos xs (y:ys)
                               | otherwise = produtos_baratos (x:xs) ys

-- faz a checagem da disponibilidade do produto no estoque 
consulta_estoque _ _ [] = False
consulta_estoque produto qtd (y:ys)   | (produto == get_nome y && qtd <= get_quantidade y) = True 
                                      | otherwise = consulta_estoque produto qtd ys 

-- retorna a lista do carrinho verificada
meu_carrinho [] _ = []
meu_carrinho (x:xs) y |(consulta_estoque (get_nome x) (get_quantidade x) y)  = [x] ++ meu_carrinho xs y
                      |otherwise = meu_carrinho xs y


-- recebe meu_carrinho e retorna outra lista para ser finalizada
calcula_valores [] = []
calcula_valores (x:xs) = [get_preco x * get_quantidade x] ++ calcula_valores xs 


-- calcula a soma final de uma lista de preços do carrinho
soma_total meu_carrinho carrinho estoque = foldl (+) 0 (calcula_valores (meu_carrinho carrinho estoque)) 




 
