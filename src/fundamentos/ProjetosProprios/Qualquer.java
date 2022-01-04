package fundamentos.ProjetosProprios;

import java.util.Scanner;

public class Qualquer {

	public static void main(String[] args) {
		// A = base * altura / 2

		double base;
		base = 25.64;
		double altura;
		altura = 764.4;
		final double DIV = 2;
		double a = base * altura / DIV;

		System.out.println("A área do triângulo é " + a + " m2");

		char u;
		u = '>';
		System.out.println(u);

		byte g = 'f';
		System.out.println(g);

		String meuNome = "Amanda Pagani Lima";
		System.out.println("Meu nome é " + meuNome + " !!".toUpperCase());

		long galaxias = 28_783_838_848_838L;
		long civilizacoes = 737_838_339;

		System.out.println("Cálculo daquele homi la sobre as civilizações: " + "\nGaláxias * Civilizações");
		System.out.println("Total de " + galaxias * civilizacoes + " civizações existentes.");

		System.out.printf("No exercício a área do triângulo deve ser definida,\nsabe-se que a fórmula"
				+ " é A = Base * Altura / 2,\nsendo a base igual %s m e a altura igual a %s m , logo o resultado será %s m^2.",
				base, altura, a);
		/*
		 * 
		 */
		System.out.println("\nWelcome to my personal project!!");

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = teclado.nextLine();

		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();

		System.out.printf("Okay,então seu nome é %s e sua idade é %d ? correto?", nome, idade);

		teclado.close();
		/*
		 * 
		 */

	}

}
