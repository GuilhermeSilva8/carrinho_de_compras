public class Main
{
	public static void main(String[] args) throws CloneNotSupportedException{
		    EstoqueProdutos estoque = new EstoqueProdutos();
        	estoque.adicionaProduto(new Produto ("monitor", 500, 100));
        	estoque.adicionaProduto(new Produto ("telefone", 150, 300));
        	estoque.adicionaProduto(new Produto ("teclado", 70, 50));
        	estoque.adicionaProduto(new Produto("mouse", 50, 50));
			
			System.out.println("Estoque antes\n");
        	System.out.println(estoque.toString());
        
            EstoqueProdutos estoque2 = new EstoqueProdutos();	
        	estoque2.adicionaProduto(new Produto("raiva", 50, 50));
        	estoque2.adicionaProduto(new Produto("linguagem ruim", 50, 50));
        	estoque2.adicionaProduto(new Produto("pessima", 50, 50));
        	
        
        	CarrinhoCompras carrinho = new CarrinhoCompras(estoque);

			carrinho.adicionaItem("teclado", 10);
			carrinho.adicionaItem("monitor", 50);
			carrinho.adicionaItem("mouse", 60);
			
			carrinho.finalizaCompras();
			
			System.out.println("Carrinho\n");
			System.out.println(carrinho.toString());
			System.out.println("Estoque depois\n");
			System.out.println(estoque.toString());
	}
}

