package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;

		// And
		System.out.println(condicao1 && !condicao2);
		// Or
		System.out.println(condicao1 || condicao2);
		// Xor
		System.out.println(condicao1 ^ condicao2);
		// Not
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("\nTabela verdade AND");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		System.out.println("\nTabela verdade OR");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade NOT");//Not é um operador unário
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!!true);
		System.out.println(!!false);
	}
}
