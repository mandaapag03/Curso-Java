package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu salário do mês de janeiro:");
		String jan = entrada.nextLine().replace(',','.');
		System.out.println("Digite seu salário do mês de fevereiro:");
		String fev = entrada.nextLine().replace(',','.');
		System.out.println("Digite seu salário do mês de março:");
		String mar = entrada.nextLine().replace(',','.');

		Double j = Double.parseDouble(jan);
		Double f = Double.parseDouble(fev);
		Double m = Double.parseDouble(mar);

		double mediaSalarial = (j + f + m) / 3;
		
		//Definiu 2 casas decimais
		mediaSalarial = Math.round(mediaSalarial * 100);
		mediaSalarial = mediaSalarial/100;
		
		System.out.println("Média do salário: "+ mediaSalarial);
		
		entrada.close();
	}

}
