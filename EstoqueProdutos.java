import java.util.*;

public class EstoqueProdutos{
    
        private ArrayList<Produto> estoque = new ArrayList<Produto>(); // criando uma lista do tipo ProdutoEstoque 
    
        public void adicionaProduto(Produto p){  // recebe uma instância de Produto
            estoque.add(p);
        }
        
        public String toString () {
		    String saida = "";
		    for (Produto p : estoque) {      // estoque é uma lista de produtos cadastrados
	    	    saida = saida + p.toString() + "\n\n";
	        }
    	    return saida;
	   }
    
}

