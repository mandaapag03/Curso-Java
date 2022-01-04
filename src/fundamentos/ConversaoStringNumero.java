package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog
				("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog
				("Digite o segundo número: ");
		String valor3 = JOptionPane.showInputDialog
				("Digite o terceiro número: ");
		
		Double n1 = Double.parseDouble(valor1);
		Double n2 = Double.parseDouble(valor2);
		Double n3 = Double.parseDouble(valor3);
		
		double soma = n1 + n2 + n3;
		
		System.out.printf("A soma é igual a %s",soma);
	}

}
