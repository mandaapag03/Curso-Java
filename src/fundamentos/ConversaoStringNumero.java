package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog
				("Digite o primeiro n�mero: ");
		String valor2 = JOptionPane.showInputDialog
				("Digite o segundo n�mero: ");
		String valor3 = JOptionPane.showInputDialog
				("Digite o terceiro n�mero: ");
		
		Double n1 = Double.parseDouble(valor1);
		Double n2 = Double.parseDouble(valor2);
		Double n3 = Double.parseDouble(valor3);
		
		double soma = n1 + n2 + n3;
		
		System.out.printf("A soma � igual a %s",soma);
	}

}
