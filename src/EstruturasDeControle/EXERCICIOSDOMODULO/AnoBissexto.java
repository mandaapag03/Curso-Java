package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o ano que voc� est�: ");
		int ano = entrada.nextInt();
		entrada.close();
		
		if (ano % 4 == 0 && !(ano % 400 == 0) && ano % 100 == 0) {
			System.out.println("N�o � um ano bissexto");
		}else 
		System.out.println("� UM ANO BISSEXTO!");

	}
}
