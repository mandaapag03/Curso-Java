package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {

		int a = 3;
		int b = a;
		int c = a + b;

		/*
		 * isso NAO � SUBSTITUI��O, MAS SIM UMA ATRIBUI��O!!!!!!!!!
		 */
		c += b;// c = c + b; (Atribui��o aditiva)
		System.out.println(c);
		c -= a;// c = c -a;(Atribui��o redutiva)
		System.out.println(c);
		c *= b;// c = c * b;(Atribui��o multipicativa)
		System.out.println(c);
		c /= a;// c = c / a;(Atribui��o divisiva)
		System.out.println(c);
		c %= 2;// c = c % 2; 0 ou 1(Atribui��o m�dulo)
		System.out.println(c);

		c++;// c = c + 1

	}
}
