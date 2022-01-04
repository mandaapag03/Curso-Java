package fundamentos.ExerciciosConceitosBasicos;

import java.util.Scanner;

public class QuadradoECubo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira um número para saber o quadrado e o cubo dele: ");
		double valor = entrada.nextDouble();

		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		System.out.printf("O quadrado de %.1f é %.2f e o cubo é %.2f ", valor, quadrado, cubo);

		entrada.close();
	}
}
