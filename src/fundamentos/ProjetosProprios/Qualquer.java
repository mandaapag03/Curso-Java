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

		System.out.println("A �rea do tri�ngulo � " + a + " m2");

		char u;
		u = '>';
		System.out.println(u);

		byte g = 'f';
		System.out.println(g);

		String meuNome = "Amanda Pagani Lima";
		System.out.println("Meu nome � " + meuNome + " !!".toUpperCase());

		long galaxias = 28_783_838_848_838L;
		long civilizacoes = 737_838_339;

		System.out.println("C�lculo daquele homi la sobre as civiliza��es: " + "\nGal�xias * Civiliza��es");
		System.out.println("Total de " + galaxias * civilizacoes + " civiza��es existentes.");

		System.out.printf("No exerc�cio a �rea do tri�ngulo deve ser definida,\nsabe-se que a f�rmula"
				+ " � A = Base * Altura / 2,\nsendo a base igual %s m e a altura igual a %s m , logo o resultado ser� %s m^2.",
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

		System.out.printf("Okay,ent�o seu nome � %s e sua idade � %d ? correto?", nome, idade);

		teclado.close();
		/*
		 * 
		 */

	}

}
