public class Main
{
	public static void main(String[] args) {
		    EstoqueProdutos estoque = new EstoqueProdutos();
        	estoque.adicionaProduto(new Produto ("monitor", 500, 100));
        	estoque.adicionaProduto(new Produto ("telefone", 150, 300));
        	estoque.adicionaProduto(new Produto ("teclado", 70, 50));
        	estoque.adicionaProduto(new Produto("mouse", 50, 50));
        
            EstoqueProdutos estoque2 = new EstoqueProdutos();	
        	estoque2.adicionaProduto(new Produto("raiva", 50, 50));
        	estoque2.adicionaProduto(new Produto("linguagem ruim", 50, 50));
        	estoque2.adicionaProduto(new Produto("pessima", 50, 50));
        	
        
        	CarrinhoCompras carrinho = new CarrinhoCompras(estoque);

        	//System.out.println(carrinho.adicionaItem("teclado", 10));
			carrinho.adicionaItem("teclado", 10);
			carrinho.adicionaItem("monitor", 50);
			carrinho.adicionaItem("mouse", 60);
			
			
        	System.out.println(carrinho.toString());
	}
}

