package EstruturasDeControle.Decis�o.IF;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 6) {// media<=10 e >=6
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		//N�O USAR ; EM ESTRUTURAS DE CONTROLE (menos em uma)
		if (media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");
		}
		
		boolean criterioReprovacaoAtingido = (media < 4.5 && media >= 0);
		
		if (criterioReprovacaoAtingido) {
			System.out.println("Reprovado");
		}
		entrada.close();
	}

}
