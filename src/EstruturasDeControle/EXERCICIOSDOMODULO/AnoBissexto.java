package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o ano que você está: ");
		int ano = entrada.nextInt();
		entrada.close();
		
		if (ano % 4 == 0 && !(ano % 400 == 0) && ano % 100 == 0) {
			System.out.println("Não é um ano bissexto");
		}else 
		System.out.println("É UM ANO BISSEXTO!");

	}
}
