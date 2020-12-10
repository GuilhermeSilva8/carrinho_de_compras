{- Diego Maia, Guilherme Silva
  Programa que simula um sistema de compras -}
 
type NomeProduto = String
type Quantidade = Int 
type Preco = Int 
type Produto = (NomeProduto, Preco, Quantidade)
type Estoque = [Produto]


estoque = [("monitor", 500, 10), ("telefone", 150, 50), ("teclado", 70, 30), ("mouse", 50, 50)]
carrinho = [("monitor", 500, 5),("mouse", 50, 100),("teclado", 70, 20), ("telefone", 150, 30)]

get_nome (n, _, _) = n
get_preco (_, p, _) = p
get_quantidade (_, _, q) = q


-- retorna uma lista de preços menores que 100    
menores_precos = filter (<100) (map(get_preco) estoque) 

-- recebe a lista menores_precos e estoque, compara com o preço do estoque e retorna uma tupla com o respectivo nome e o preço
produtos_baratos [] _ = []
produtos_baratos (x:xs) (y:ys) | (x == get_preco y) = [(get_nome y, x)] ++ produtos_baratos xs (y:ys)
                               | otherwise = produtos_baratos (x:xs) ys

percorreEstoque _ _ [] = False
percorreEstoque produto qntd (y:ys) | (produto == get_nome y && qntd <= get_quantidade y) = True
                                    | otherwise = percorreEstoque produto qntd ys
-- checa se o produto tem no estoque com a quantidade pedida, se falhar em algumas das condições o produto não é adicionado
verificaCarrinho [] _ = []
verificaCarrinho (x:xs) y |(percorreEstoque (get_nome x) (get_quantidade x) y)  = [x] ++ verificaCarrinho xs y
                          |otherwise = verificaCarrinho xs y


-- recebe a lista do carrinho já verificada 
meu_carrinho carrinho estoque = verificaCarrinho carrinho estoque 


-- recebe a lista meu_carrinho e retorna outra lista para ser finalizada
lista_valores [] = []
lista_valores (x:xs) = [get_preco x * get_quantidade x] ++ lista_valores xs 


-- calcula a soma final de uma lista de preços do carrinho
somaTotal = foldl (+) 0 (lista_valores (meu_carrinho carrinho estoque)) 




 
