package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.print("Bom"); // System.out.print => imprime uma string sem quebra de linha.
		System.out.print(" dia\n");
		// Essa proxima linha fica junta sem o \n :
		System.out.println("Boa");
		System.out.println("tarde");

		System.out.printf("Megasena: %d %d %d %d %d", 1, 2, 3, 4, 5);
		System.out.printf("%nSalário: %.1f%n", 7162.8282);
		System.out.printf("Nome: %s%n", "Amanda");
		System.out.printf("Idade: %d%n", 18);

		// Tipo + Identificador = valor da variavel
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.printf("Então seu nome é %s %s e sua idade é %d?", nome, sobrenome, idade);

		entrada.close();// Fechar o scanner

	}

}
