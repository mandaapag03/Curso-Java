package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeroMaior = 0;
		int contador = 0;
		do {
			System.out.println("Digite um número: ");	
			int entrada = teclado.nextInt();
			
			if (entrada > numeroMaior) {
				numeroMaior = entrada;
			}
			
			contador ++;
			System.out.printf("\n%d° número = %d\n\n", contador, entrada);
			
		}while(contador != 10);
		
		System.out.printf("--> O maior valor foi %d", numeroMaior);
		
		teclado.close();
	}
}
