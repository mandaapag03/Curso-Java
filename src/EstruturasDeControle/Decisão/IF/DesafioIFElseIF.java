package EstruturasDeControle.Decisão.IF;

import java.util.Scanner;

public class DesafioIFElseIF {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String dia = teclado.nextLine();
		teclado.close();
		
		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println("Dia 1");
		}else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("Dia 2");
		}else if (dia.equalsIgnoreCase("Terça") || dia.equalsIgnoreCase("Terca")) {
			System.out.println("Dia 3");
		}else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("Dia 4");
		}else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("Dia 5");
		}else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("Dia 6");
		}else if (dia.equalsIgnoreCase("Sábado") || dia.equalsIgnoreCase("Sabado")) {
			System.out.println("Dia 7");
		}else {
			System.out.println("Dia inválido");
		}
		
		/*Posso tbm colocar:
		 * if ("domingo".equalsIgnoreCase(dia)){
		 * }
		 */
		
	}

}
