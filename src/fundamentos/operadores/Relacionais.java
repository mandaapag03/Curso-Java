package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		//cada letra do alfabeto tem seu numero inteiro
		//correspondente a sua posição na tabela UNICODE.
		// A = 97
		
		int a = 97;
		int b = 'a';
		System.out.println(a == b);
		System.out.println('\u0061'); //esse numero é 97 em hexadecimal.
		
		System.out.println(3 > 4); //maior
		System.out.println(3 >= 3);//maior igual
		System.out.println(3 < 7);//menor
		System.out.println(30 <= 7);//menor igual
		System.out.println(30 != 7);//diferente que
		System.out.println(30 == 7);//igual
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}

}
