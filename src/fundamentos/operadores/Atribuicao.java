package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {

		int a = 3;
		int b = a;
		int c = a + b;

		/*
		 * isso NAO É SUBSTITUIÇÃO, MAS SIM UMA ATRIBUIÇÃO!!!!!!!!!
		 */
		c += b;// c = c + b; (Atribuição aditiva)
		System.out.println(c);
		c -= a;// c = c -a;(Atribuição redutiva)
		System.out.println(c);
		c *= b;// c = c * b;(Atribuição multipicativa)
		System.out.println(c);
		c /= a;// c = c / a;(Atribuição divisiva)
		System.out.println(c);
		c %= 2;// c = c % 2; 0 ou 1(Atribuição módulo)
		System.out.println(c);

		c++;// c = c + 1

	}
}
