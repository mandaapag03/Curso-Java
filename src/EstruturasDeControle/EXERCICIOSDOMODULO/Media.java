package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe sua nota 1: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Informe sua nota 2: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) /2;
		
		System.out.println("Sua m�dia �: " + media);
		
		if (media >= 7) {
			System.out.println("Aprovado!Parab�ns!!");
		}else if (media <7 && media > 4) {
			System.out.println("Recupera��o");
		}else {
			System.out.println("Reprovado");
		}
		entrada.close();
	}

}
