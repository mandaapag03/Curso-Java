package EstruturasDeControle.Repeti��o.DOWHILE;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		//if (...) senten�a de c�digo; ou {}
		//while (...) senten�a de c�digo; ou {}
		//for (...;...;...) senten�a de c�digo; ou {}
		
		//do senten�a de c�digo; ou {} while (...); //A UNICA SENTEN�A QUE TERMINA COM ;
		
		Scanner entrada = new Scanner(System.in);

		String texto = "por favor";
		
		do {
			System.out.println("Voc� tem quer dizer as"
					+ " palavrinhas m�gicas");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor")); 

		System.out.println("Obrigado,o que custou ser educado?");
		entrada.close();
	}

}
