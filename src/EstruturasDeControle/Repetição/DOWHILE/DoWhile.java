package EstruturasDeControle.Repetição.DOWHILE;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		//if (...) sentença de código; ou {}
		//while (...) sentença de código; ou {}
		//for (...;...;...) sentença de código; ou {}
		
		//do sentença de código; ou {} while (...); //A UNICA SENTENÇA QUE TERMINA COM ;
		
		Scanner entrada = new Scanner(System.in);

		String texto = "por favor";
		
		do {
			System.out.println("Você tem quer dizer as"
					+ " palavrinhas mágicas");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor")); 

		System.out.println("Obrigado,o que custou ser educado?");
		entrada.close();
	}

}
