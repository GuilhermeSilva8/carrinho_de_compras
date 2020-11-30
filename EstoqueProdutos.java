import java.util.*;

public class EstoqueProdutos{
    
        private ArrayList<ProdutoEstoque> estoque = new ArrayList<ProdutoEstoque>(); // criando uma lista do tipo ProdutoEstoque 
    
        public void adicionaProduto(ProdutoEstoque p){  // recebe uma instância de ProdutoEstoque 
            estoque.add(p);
        }
        
        
        public String toString () {
		    String saida = "";
		    for (ProdutoEstoque p : estoque) {
	    	    saida = saida + p.toString() + "\n\n";
	        }
    	    return saida;
	   }
    
}

