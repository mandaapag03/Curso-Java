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
			System.out.println("Bem vindo ao Jogo da advinha��o!");
			System.out.println("Tente acertar o n�mero que eu sorteei,� de 0 a 100.");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			System.out.println("Voc� tem 10 tentativas");
			tentativas = 0;

			do {
				tentativas++;
				System.out.printf("\n\nTentativa %d: ",tentativas);
				numeroDigitado = entrada.nextInt();

				if (numeroDigitado < numeroSorteado) {
					System.out.printf("\nDica: � maior que %d", numeroDigitado);
				} else if (numeroDigitado > numeroSorteado) {
					System.out.printf("\nDica: � menor que %d", numeroDigitado);

				} else {
					System.out.printf("\nVOC� ACERTOU!!PARAB�NS!! em %d tentativas" , tentativas);
				}
			} while (numeroDigitado != numeroSorteado || tentativas >=1 && tentativas<=10);
			System.out.println("Digite 0 para sair e qualquer outro para continuar");
			continuar = entrada.nextInt();

		} while (continuar != 0);
		entrada.close();

	}
}

//		System.out.println("JOGO DA ADIVINHA��O!!");
//		int x = 86;
//		int num = 0;
//
//		for (int tentativas = 0; tentativas >= 0 && tentativas <= 9;) {
//
//			if (num != x) {
//				System.out.println("\nAdvinhe o n�mero que estou escondendo(DICA:� de 0 a 100): ");
//				num = entrada.nextInt();
//				tentativas++;
//				System.out.println("Voc� errou,tente novamente");
//
//				if (num >= 0 && num < 86) {
//					System.out.printf("\nDica --> o n�mero � maior que %d", num);
//				} else if (num >= 87 && num <= 100) {
//					System.out.printf("\nDica--> o n�mero � menos que %d", num);
//				}
//
//				System.out.printf("Tentativa: %d\n", tentativas);
//
//				if (tentativas == 10) {
//					System.out.println("Que pena voc� n�o conseguiu!");
//				}
//				if (num == 86) {
//					System.out.println("VOC� ACERTOU!!PARAB�NS!!");
//				}
//			}
//		}