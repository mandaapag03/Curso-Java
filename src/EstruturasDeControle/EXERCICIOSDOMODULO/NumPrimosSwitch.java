package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Scanner;

public class NumPrimosSwitch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeDivisoes = 0;
		
		System.out.println("Insira um n�mero: ");
		int num = entrada.nextInt();

		for (int divisor = 2; divisor < num; divisor++) {
			if (num % divisor == 0) {
				quantidadeDeDivisoes++;
			}
		}

		switch (quantidadeDeDivisoes) {
		case 0:
			System.out.println(num + " � um n�mero primo!!");
			break;
		default:
			System.out.println(num + " n�o � um n�mero primo!!");
		}
		entrada.close();
	}
}
