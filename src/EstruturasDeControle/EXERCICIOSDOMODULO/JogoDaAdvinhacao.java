package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdvinhacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numeroDigitado;
		int continuar;
		int tentativas;
		int numeroSorteado;

		do {
			System.out.println("Bem vindo ao Jogo da advinhação!");
			System.out.println("Tente acertar o número que eu sorteei,é de 0 a 100.");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			System.out.println("Você tem 10 tentativas");
			tentativas = 0;

			do {
				tentativas++;
				System.out.printf("\n\nTentativa %d: ",tentativas);
				numeroDigitado = entrada.nextInt();

				if (numeroDigitado < numeroSorteado) {
					System.out.printf("\nDica: é maior que %d", numeroDigitado);
				} else if (numeroDigitado > numeroSorteado) {
					System.out.printf("\nDica: é menor que %d", numeroDigitado);

				} else {
					System.out.printf("\nVOCÊ ACERTOU!!PARABÉNS!! em %d tentativas" , tentativas);
				}
			} while (numeroDigitado != numeroSorteado || tentativas >=1 && tentativas<=10);
			System.out.println("Digite 0 para sair e qualquer outro para continuar");
			continuar = entrada.nextInt();

		} while (continuar != 0);
		entrada.close();

	}
}

//		System.out.println("JOGO DA ADIVINHAÇÃO!!");
//		int x = 86;
//		int num = 0;
//
//		for (int tentativas = 0; tentativas >= 0 && tentativas <= 9;) {
//
//			if (num != x) {
//				System.out.println("\nAdvinhe o número que estou escondendo(DICA:é de 0 a 100): ");
//				num = entrada.nextInt();
//				tentativas++;
//				System.out.println("Você errou,tente novamente");
//
//				if (num >= 0 && num < 86) {
//					System.out.printf("\nDica --> o número é maior que %d", num);
//				} else if (num >= 87 && num <= 100) {
//					System.out.printf("\nDica--> o número é menos que %d", num);
//				}
//
//				System.out.printf("Tentativa: %d\n", tentativas);
//
//				if (tentativas == 10) {
//					System.out.println("Que pena você não conseguiu!");
//				}
//				if (num == 86) {
//					System.out.println("VOCÊ ACERTOU!!PARABÉNS!!");
//				}
//			}
//		}