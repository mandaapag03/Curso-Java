package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		// var = Infere o tipo da variavel sozinha
		var a = 4.5;
		System.out.println(a);

		var b = "Cachorro";
		System.out.println(b);

		b = "Gato";
		System.out.println(b);

		var c = 34; // Declarei e inicializei a variável
		System.out.println(c);

		/*
		 * Uma vez q o java inferiu um tipo da variável,ele nao pode ser mudado ex : var
		 * b = "Caju" b = 45 *isso gera erro*
		 */

		double d; // Variável foi declarada
		d = 739.99; // Variável foi inicializada
		System.out.println(d); // Foi usada

		/*
		 * ---> é obrigatório declarar e inicializar na mesma linha quando se usa o VAR.
		 */
	}

}
