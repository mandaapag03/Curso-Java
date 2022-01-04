package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Scanner;

public class numerosPrimos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeDivisoesInteiras = 0;
		
		System.out.println("Insira um número: ");
		int num = entrada.nextInt();
		
		//Aq serão feitas as divisões,
		//se o número que foi digitado for divisível por qualquer número até ele,não é primo;
		//se ele não for divisível por nenhum,ele é primo.
		for (int divisor = 2; divisor < num; divisor++) {
			if (num % divisor == 0) {
				quantidadeDeDivisoesInteiras ++;//se for divisível --> quantidadeDeDivisoesInteiras = 1
			}
		}
		if (quantidadeDeDivisoesInteiras == 0) {
			System.out.println("É UM NÚMERO PRIMO!!");
		}else 
			System.out.println("Não é um número primo");
		 
		

		entrada.close();
		}
	}

