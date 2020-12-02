import java.util.*;

public class CarrinhoCompras{
    
    protected EstoqueProdutos estoque;  // instância de EstoqueProdutos(contem todos os elementos cadastrados que são do tipo Produto)  
                                        // como percorrer essa lista através da instância estoque?
  
    private ArrayList<Produto> carrinho = new ArrayList<Produto>();  // lista para adicionar cada produto no carrinho
    

    public CarrinhoCompras (EstoqueProdutos estoque){
        this.estoque = estoque; 
    }
    
    public void adicionaItem(String nome, int qtd) throws CloneNotSupportedException{     // recebe o nome de um produto e a quantidade
	
		if(estoque.percorreEstoque(nome, qtd) == null){
			System.out.println("Nao foi possivel adicionar o item ao carrinho");
		}
		else{
			Produto prod = estoque.percorreEstoque(nome, qtd);
			prod.setQuantidade(qtd);
			carrinho.add(prod);
        }
		
    } 
    
    
    public void finalizaCompras(){   // subtrai a quantidade de produto comprada do estoque  
        for(Produto p: carrinho){
			estoque.percorreEstoque2(p.getNome(), p.getQuantidade());
		}	
    }
	
    public void calculaTotal(){    // soma dos valores * qtd
        
    }  
	
	public String toString () {
		String saida = "";
        for(Produto p: carrinho){
            saida = saida + p.toString() + "\n\n"; 
        }
        return saida ;
	}

}
