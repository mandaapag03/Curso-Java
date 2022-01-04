package fundamentos.ExerciciosConceitosBasicos;

import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Informe o valor em Celsius: ");
	
	double c = entrada.nextDouble();
	double f = c * 1.8 + 32;
	
	System.out.printf("F = %.2f °F", f);
	
	
	entrada.close();

	}
}

