package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Scanner;

public class numero0a10Epar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		
		if (numero <=10 && numero >= 0) {
			System.out.println("Esse número está entre 0 e 10");
		}else {
			System.out.println("Esse número não está entre 0 e 10");
		}
		
		if (numero % 2 ==0) {
			System.out.println("E é par");
		}else {
			System.out.println("E é ímpar");
		}
		
		System.out.println("Fim!");
		entrada.close();
	}

}
