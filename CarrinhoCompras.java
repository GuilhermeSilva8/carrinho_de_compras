import java.util.*;

public class CarrinhoCompras{
    
    protected EstoqueProdutos estoque;  // instância de EstoqueProdutos(contem todos os elementos cadastrados que são do tipo Produto)  
                                   
  
    private ArrayList<Produto> carrinho = new ArrayList<Produto>();  // lista para adicionar cada produto no carrinho
    

    public CarrinhoCompras (EstoqueProdutos estoque){
        this.estoque = estoque; 
    }
    
    public void adicionaItem(String nome, int qtd) throws CloneNotSupportedException{     
	
		if(estoque.percorreEstoque(nome, qtd) == null){
			System.out.println("Nao foi possivel adicionar o item ao carrinho! \n\n");
		}
		else{
			Produto prod = estoque.percorreEstoque(nome, qtd);
			prod.setQuantidade(qtd);
			carrinho.add(prod);
        }
		
    } 
    
    
    public void finalizaCompras(){   
        for(Produto p: carrinho){
			estoque.percorreEstoque2(p.getNome(), p.getQuantidade());
		}	
    }
	
    public double calculaTotal(){    
    	double total = 0;
    	for(Produto p: carrinho){
    		total = total + (p.getQuantidade() * p.getValor()); 
    	}
    	return total;
    }  
	
    public String toString () {
	String saida = "";
        for(Produto p: carrinho){
            saida = saida + p.toString() + "\n\n"; 
        }
        return saida ;
    }
}
