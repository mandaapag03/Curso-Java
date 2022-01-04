package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bonjour cara de CU";
//			s.toUpperCase(); // Altera só na linha que foi colocado.Precisa do "s =".
		s = s.replace("CU", "Caju");
		s = s.toUpperCase(); // método que deixa a string em capslock
		s = s.concat("!!!");

		System.out.println(s);

		String a = "Levanta".toUpperCase().concat("!!!!");

		System.out.println(a);
		// ou ainda só
		System.out.println("Agora".concat("aaaaa").toUpperCase());

		// Tipos primitivos não tem o operador "."

	}

}
