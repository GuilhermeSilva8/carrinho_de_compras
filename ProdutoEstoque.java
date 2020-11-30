public class ProdutoEstoque extends Produto{
	
	private int qtd;
	

	public ProdutoEstoque(String nome, double valor, int qntd){
		this.nome = nome;
		this.valor = valor;
		this.qtd = qntd;
	}

	public int getQuantidade(){
        	return qtd;
    	}
    
    	public void setQuantidade(int quantidade){
        	this.qtd = quantidade;
    	}

}
