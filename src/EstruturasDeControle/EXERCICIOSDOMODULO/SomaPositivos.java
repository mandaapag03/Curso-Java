package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Scanner;

public class SomaPositivos {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Somador de números (para sair insira um número negativo) ");
		
		int entrada = 0;
		int total = 0;
		
		do {
			System.out.println("Insira um número: ");
			entrada = teclado.nextInt();
			total += entrada;
		}while (entrada>-1);
		
		if (entrada <=-1) {
			total -= entrada;
			System.out.println("Soma = " + total);
		}
		
		
		teclado.close();
	} 
}
