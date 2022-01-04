package EstruturasDeControle.Repeti��o.WHILE;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.print("Informe a nota (ou para sair, digite -1): ");
			nota = entrada.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else if (nota >10 && nota <0) {
				System.out.println("Nota inv�lida!");
			}
		}
		// Calcular m�dia
		double media = total /quantidadeDeNotas;
		System.out.printf("M�dia = %.1f", media);

		entrada.close();
	}

}

// A tentativa da gatah:

//		System.out.println("C�lculo de m�dias: ");
//		int contador = 1;
//
//		while (!(entrada.nextDouble() == -1)) {
//			System.out.println("Insira a nota: ");
//			double teclado = entrada.nextDouble();
//
//			while (teclado < 0 && teclado > 10) {
//				System.out.println("Valor inv�lido");
//			}
//			while (contador >= 1) {
//				System.out.println(contador);
//				contador++;
//			}
//		}