package EstruturasDeControle.Decisão.IF;

public class DesafioIf {

	public static void main(String[] args) {

		double nota = 1.3;

		// NÃO USAR ; EM ESTRUTURAS DE CONTROLE (menos em uma)
		/*
		 * pois ela cria um bloco de código vazio e oq está
		 * no parenteses q devia estar ligado ao IF fica 
		 * desvincilado a entrutura de controle.
		 */

		if (nota >= 9.0)
			;
		{
			System.out.println("Quadro de honra!!");
			System.out.println("Você é fera!!");
		}
	}

}
