public class Produto{
    protected String nome;      // protected permite o acesso "this.nome" a uma classe que herda de Produto
    protected double valor;      // ao invés de this.getNome
    
    
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
}

