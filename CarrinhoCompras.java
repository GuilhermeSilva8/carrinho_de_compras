import java.util.*;

public class CarrinhoCompras{
    
    protected EstoqueProdutos estoque;  // instância de EstoqueProdutos(contem todos os elementos cadastrados que são do tipo Produto)  
                                        // como percorrer essa lista através da instância estoque?
  
    private ArrayList<Produto> carrinho = new ArrayList<Produto>();  // lista para adicionar cada produto no carrinho
    

    public CarrinhoCompras (EstoqueProdutos estoque){
        this.estoque = estoque; 
    }
    
    public void adicionaItem(String nome, int qtd){     // recebe o nome de um produto e a quantidade
        for(Produto p: this.estoque){
            if(p.getNome() == nome){ 
                if(p.getQuantidade() >= qtd){    // se tem o produto com a quantidade com a pedida então adiciona no carrinho
                    carrinho.add(p);
                }else{
                    System.out.println("Estoque insuficiente!");
                    break;
                }
            }
        }  
    } 
    
    
    public void finalizaCompras(){   // subtrai a quantidade de produto comprada do estoque  
        
    }
    public void calculaTotal(){    // soma dos valores * qtd
        
    }  
    
     /*public String toString(){
        String saida = "--- Carrinho --- \n" + this.estoque;
        return saida;
    } */
    
    
    public String toString (){
	    String saida = "";
		for (Produto p : this.estoque){      // estoque é uma lista de produtos no carrinho
	    	saida = saida + p.toString() + "\n\n";
	    }
        return saida;
    } 
}
