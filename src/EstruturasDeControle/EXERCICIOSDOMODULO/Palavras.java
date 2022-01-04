package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Scanner;

public class Palavras {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String entrada = "";
		
		System.out.println("Digite uma palavra: ");
		entrada = teclado.nextLine();
		
		char letras[] = entrada.toUpperCase().toCharArray();
		
		for (int contador = 0; contador < letras.length;contador ++) {
			System.out.println(letras[contador]);
		}
		
		teclado.close();
	}
}