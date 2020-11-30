public class ProdutoEstoque{
    protected int qtd;
    protected String nome;      // protected permite o acesso "this.nome" a uma classe que herda de Produto
    protected double valor;    // ao invés de this.getNome
    

    public ProdutoEstoque(String nome, double valor, int qntd){
	this.nome = nome;
	this.valor = valor;
	this.qtd = qntd;
    }
	
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }

    public int getQuantidade(){
        return qtd;
    }
    
    public void setQuantidade(int quantidade){
        this.qtd = quantidade;
    }
    
    public String toString() {
		return "Nome: " + this.getNome() + "\n" +
		       "Valor: " + this.getValor() + "\n" +
		       "Quantidade em estoque: " + this.getQuantidade();
   }
}

