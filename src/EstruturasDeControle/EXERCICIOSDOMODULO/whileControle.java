package EstruturasDeControle.EXERCICIOSDOMODULO;

import java.util.Scanner;

public class whileControle {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int contador = 0;
		int total = (num + contador)/contador;
		
		while (contador != 8) { //Repetições indefinidas
			System.out.println("Digite um numero: ");
			num = entrada.nextInt();
			contador ++;
		}
		
		System.out.println("A soma é " + total);
			
		entrada.close();
	}
	
//	public class forControle {
//		public static void main(String[] args) {
//			Scanner entrada = new Scanner(System.in);
//			int digite = 0;
//			
//			for (int num = 1;num<=5;num ++) { //Contador --> (variavel contador; condição; atribuição){instruções}
//				System.out.println("Digite um numero: ");
//				digite = entrada.nextInt();
////				num = entrada.nextInt(); //se colocar 5 ou mais o programa para.
//				System.out.printf("%d foi sua escolha\n\n", digite);
//			}
//			
//			System.out.println("FIM!!");
//			entrada.close();
//		}
//	}
}
