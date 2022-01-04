package fundamentos.ProjetosProprios;

import java.util.Locale;
import java.util.Scanner;

public class NotasDosAlunos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		System.out.println("Olá querido aluno!");
		System.out.println(
				"Bem vindo a este campo,onde você pode inserir suas médias bimestrais e nós calcularemos sua média anual!");

		Scanner entrada = new Scanner(System.in);

		System.out.print("Por favor digite seu nome¨completo: ");
		String nome = entrada.nextLine();
		System.out.printf("Olá %s de que série você é? ", nome);
		String serie = entrada.nextLine();
		System.out.printf("Confirmando,seu nome é %s e sua série é %s.%n", nome, serie);

		System.out.print("De qual disciplina você quer saber a nota? ");
		String disciplina = entrada.nextLine();

		Double PrimeiroBimestre;
		Double SegundoBimestre;
		Double TerceiroBimestre;
		Double QuartoBimestre;

		System.out.println("Digite sua nota do 1°Bimestre: ");
		PrimeiroBimestre = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Digite sua nota do 2°Bimestre: ");
		SegundoBimestre = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Digite sua nota do 3°Bimestre: ");
		TerceiroBimestre = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Digite sua nota do 4°Bimestre: ");
		QuartoBimestre = entrada.nextDouble();
		entrada.nextLine();

		Double mediaAnual = (PrimeiroBimestre + SegundoBimestre + TerceiroBimestre + QuartoBimestre) / 4.0;

		System.out.printf("Sua média anual de %s é %.1f.", disciplina, mediaAnual);

		entrada.close();

		if (mediaAnual >= 6) {
			System.out.println("\nParabéns,você foi aprovado!");
		} else {
			System.out.println("\nSinto muito,você foi reprovado!");
		}
	}

}
