package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Scanner;

public class SomaPositivos {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Somador de n�meros (para sair insira um n�mero negativo) ");
		
		int entrada = 0;
		int total = 0;
		
		do {
			System.out.println("Insira um n�mero: ");
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
