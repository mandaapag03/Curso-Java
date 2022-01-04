package fundamentos.ExerciciosConceitosBasicos;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	System.out.println("Informe o valor de A: ");
	double a = entrada.nextDouble();
	System.out.println("Informe o valor de B: ");
	double b = entrada.nextDouble();
	System.out.println("Informe o valor de C: ");
	double c = entrada.nextDouble();
	
	double delta = Math.pow(b,2) - 4 * a * c ;
	
	System.out.printf("O valor de delta é: %.2f", delta);
	
	double x1 = -b + Math.sqrt(delta)/ 2 * a;
	double x2 = -b - Math.sqrt(delta)/ 2 * a;
	
	System.out.printf("\nx\' = %.2f", x1);
	System.out.printf("\nx\" = %.2f", x2);
	

	entrada.close();
	}
}
