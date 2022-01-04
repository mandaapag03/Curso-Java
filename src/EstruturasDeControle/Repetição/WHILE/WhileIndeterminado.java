package EstruturasDeControle.Repetição.WHILE;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String teclado = "";
		
		while (!teclado.equalsIgnoreCase("Sair")) {
			System.out.print("Digite algo: ");
			teclado = entrada.nextLine();
		}
		
		entrada.close();
	}

}
