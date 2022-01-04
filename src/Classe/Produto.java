package Classe;

public class Produto {
	// Variáveis que pertencem ao objeto
	String nome;
	double preco;
	static double desconto = 0.25;

	Produto(String nomeInicial,double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	Produto() {

	}

	static double precoComDesconto(double preco/* os parametros ja existem na classe */) {
		double x = preco * desconto;
		double resultado = preco - x;
		return resultado;
	}
}
