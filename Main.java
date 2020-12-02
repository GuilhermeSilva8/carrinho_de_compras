public class Main
{
	public static void main(String[] args) throws CloneNotSupportedException{
		EstoqueProdutos estoqueInformatica = new EstoqueProdutos();
        	estoqueInformatica.adicionaProduto(new Produto ("monitor", 500, 100));
        	estoqueInformatica.adicionaProduto(new Produto ("telefone", 150, 300));
        	estoqueInformatica.adicionaProduto(new Produto ("teclado", 70, 50));
        	estoqueInformatica.adicionaProduto(new Produto("mouse", 50, 50));
			
            	EstoqueProdutos estoqueCarros = new EstoqueProdutos();	
        	estoqueCarros.adicionaProduto(new Produto("HB20", 50.000, 20));
        	estoqueCarros.adicionaProduto(new Produto("Camaro", 380.000, 10));
        	estoqueCarros.adicionaProduto(new Produto("Audi Sedan", 130.000, 50));
        	
        	System.out.println("--- Estoque antes ---\n");
        	System.out.println(estoqueInformatica.toString());
        
        	CarrinhoCompras carrinho = new CarrinhoCompras(estoqueInformatica);

		carrinho.adicionaItem("teclado", 10);
		carrinho.adicionaItem("monitor", 50);
		carrinho.adicionaItem("mouse", 60);
			
		carrinho.finalizaCompras();
			
		System.out.println("--- Carrinho ---\n");
		System.out.println(carrinho.toString());
		System.out.println("--- Estoque depois ---\n\n");
		System.out.println(estoqueInformatica.toString());
		System.out.println("--- Valor total: --- " + carrinho.calculaTotal());	
			
	}
}

