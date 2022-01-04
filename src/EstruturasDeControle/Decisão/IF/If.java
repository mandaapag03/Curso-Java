package EstruturasDeControle.Decisão.IF;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 6) {// media<=10 e >=6
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		//NÃO USAR ; EM ESTRUTURAS DE CONTROLE (menos em uma)
		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		
		boolean criterioReprovacaoAtingido = (media < 4.5 && media >= 0);
		
		if (criterioReprovacaoAtingido) {
			System.out.println("Reprovado");
		}
		entrada.close();
	}

}
