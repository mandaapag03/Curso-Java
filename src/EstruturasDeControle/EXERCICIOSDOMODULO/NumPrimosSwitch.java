package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Scanner;

public class NumPrimosSwitch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeDivisoes = 0;
		
		System.out.println("Insira um número: ");
		int num = entrada.nextInt();

		for (int divisor = 2; divisor < num; divisor++) {
			if (num % divisor == 0) {
				quantidadeDeDivisoes++;
			}
		}

		switch (quantidadeDeDivisoes) {
		case 0:
			System.out.println(num + " é um número primo!!");
			break;
		default:
			System.out.println(num + " não é um número primo!!");
		}
		entrada.close();
	}
}
