package fundamentos.ExerciciosConceitosBasicos;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Infome seu peso: ");
		double peso = entrada.nextDouble();
		System.out.println("Informe sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		System.out.printf("Seu IMC é: %.2f", imc);

		entrada.close();
	}
}
