import java.util.*;

public class EstoqueProdutos{
    
        protected ArrayList<Produto> estoque = new ArrayList<Produto>();  
                                                                        
        public void adicionaProduto(Produto p){ 
            estoque.add(p);
        }
        
        public Produto percorreEstoque(String nome, int qtd) throws CloneNotSupportedException{
        	for(Produto p: this.estoque){   
        	    if(p.getNome() == nome){ 
                    	if(p.getQuantidade() >= qtd){   
				Produto pCopia = (Produto) p.clone();
                        	return pCopia;
                    }else{
				System.out.println("Quantidade indisponivel no estoque!\n");
			}	
                    } 
        	}
        	return null;
        }
		
	public void percorreEstoque2(String nome, int qtd){
        	for(Produto p: this.estoque){   
        	    if(p.getNome() == nome){ 
                    	p.setQuantidade(p.getQuantidade()-qtd);
                	} 
        	}
        }
        
        public String toString () {
		    String saida = "";
		    for (Produto p : this.estoque) {      // estoque é uma lista de produtos cadastrados
	    	    	saida = saida + p.toString() + "\n\n";
	            }
    	    return saida;
	}
}

