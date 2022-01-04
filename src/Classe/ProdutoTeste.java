package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {

		System.out.println("Carrinho: ");

		Produto p1 = new Produto();
		p1.nome = "Jaca";
		p1.preco = 10.50;

		var p2 = new Produto("Caneta Preta",2.0);

		Produto.desconto = 0.5;
		
		System.out.println(p1.nome + " " +"R$ "+ Produto.precoComDesconto(10.50));
		System.out.println(p2.nome + " " +"R$ "+ Produto.precoComDesconto(2.0));

		double precoFinalp1 = Produto.precoComDesconto(10.50);
		double precoFinalp2 = Produto.precoComDesconto(2.0);
		double mediaCarrinho = ((precoFinalp1 + precoFinalp2) / 2);

		System.out.printf("Média do carrinho = R$ %.2f", mediaCarrinho);
	}
}
