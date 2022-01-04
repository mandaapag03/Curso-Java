package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		/*
		 * Correção do desafio!Exercitar mais!
		 */
		boolean tTerca = false;
		boolean tQuinta = false;
		
		boolean tv50polegadas  = tTerca && tQuinta;
		boolean tv32polegadas = tTerca ^ tQuinta;
		boolean sorvete = tQuinta || tTerca;
		boolean naoTomouSorvete = !sorvete;
		
		System.out.println("Comprou TV de 50 polegadas? " + tv50polegadas);
		System.out.println("Comprou TV de 32 polegadas? " + tv32polegadas);
		System.out.println("Tomaram sorvete? " + sorvete);
		System.out.println("Ficaram mais saudáveis? " + naoTomouSorvete);
		
		
		
		
		
		
		
		
	}

}
