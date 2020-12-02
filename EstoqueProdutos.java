import java.util.*;

public class EstoqueProdutos{
    
        protected ArrayList<Produto> estoque = new ArrayList<Produto>(); // criando uma lista do tipo ProdutoEstoque. Essa lista pode ser entendida
                                                                        // como atributo de classe 
    
        public void adicionaProduto(Produto p){  // recebe uma instância de Produto
            estoque.add(p);
        }
        
        public Produto percorreEstoque(String nome, int qtd){
        	for(Produto p: this.estoque){   
        	    if(p.getNome() == nome){ 
                    if(p.getQuantidade() >= qtd){    // se tem o produto com a quantidade com a pedida então adiciona no carrinho
                        return p;
                    }
                } 
        	}
        	return null;
        }

        public String toString () {
		    String saida = "";
		    for (Produto p : this.estoque) {      // estoque é uma lista de produtos cadastrados
	    	    saida = saida + p.toString() + "\n\n";
	            }
    	    return saida;
	   }
}

