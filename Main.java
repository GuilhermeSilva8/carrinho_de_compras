public class Main
{
	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
        	estoque.adicionaProduto(new Produto ("monitor", 500, 100));
        	estoque.adicionaProduto(new Produto ("telefone", 150, 300));
        	estoque.adicionaProduto(new Produto ("teclado", 70, 50));
        	estoque.adicionaProduto(new Produto("mouse", 50, 50));
        	
        	//System.out.println(estoque.toString());
        
        	CarrinhoCompras carrinho = new CarrinhoCompras(estoque);
        	carrinho.adicionaItem("monitor", 2);
        	carrinho.adicionaItem("telefone", 5);
        	//carrinho.adicionaItem("teclado", 2);
        	//carrinho.finalizaCompra();
        	
        	System.out.println(carrinho.toString());
        	
        	
	}
}

