package EstruturasDeControle.Decis�o.IF;

public class DesafioIf {

	public static void main(String[] args) {

		double nota = 1.3;

		// N�O USAR ; EM ESTRUTURAS DE CONTROLE (menos em uma)
		/*
		 * pois ela cria um bloco de c�digo vazio e oq est�
		 * no parenteses q devia estar ligado ao IF fica 
		 * desvincilado a entrutura de controle.
		 */

		if (nota >= 9.0)
			;
		{
			System.out.println("Quadro de honra!!");
			System.out.println("Voc� � fera!!");
		}
	}

}
