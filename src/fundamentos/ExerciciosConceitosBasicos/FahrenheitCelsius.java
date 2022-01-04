package fundamentos.ExerciciosConceitosBasicos;

import java.util.Scanner;

public class FahrenheitCelsius {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor em Fahrenheit: ");
		double f = entrada.nextDouble();
		double c = (f - 32) / 1.8;
		System.out.printf("c = %.2f °C", c);
		
		
		entrada.close();
	}
}
