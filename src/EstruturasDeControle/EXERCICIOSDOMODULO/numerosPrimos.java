package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Scanner;

public class numerosPrimos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeDivisoesInteiras = 0;
		
		System.out.println("Insira um n�mero: ");
		int num = entrada.nextInt();
		
		//Aq ser�o feitas as divis�es,
		//se o n�mero que foi digitado for divis�vel por qualquer n�mero at� ele,n�o � primo;
		//se ele n�o for divis�vel por nenhum,ele � primo.
		for (int divisor = 2; divisor < num; divisor++) {
			if (num % divisor == 0) {
				quantidadeDeDivisoesInteiras ++;//se for divis�vel --> quantidadeDeDivisoesInteiras = 1
			}
		}
		if (quantidadeDeDivisoesInteiras == 0) {
			System.out.println("� UM N�MERO PRIMO!!");
		}else 
			System.out.println("N�o � um n�mero primo");
		 
		

		entrada.close();
		}
	}

