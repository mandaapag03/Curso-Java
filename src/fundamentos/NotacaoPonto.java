package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bonjour cara de CU";
//			s.toUpperCase(); // Altera s� na linha que foi colocado.Precisa do "s =".
		s = s.replace("CU", "Caju");
		s = s.toUpperCase(); // m�todo que deixa a string em capslock
		s = s.concat("!!!");

		System.out.println(s);

		String a = "Levanta".toUpperCase().concat("!!!!");

		System.out.println(a);
		// ou ainda s�
		System.out.println("Agora".concat("aaaaa").toUpperCase());

		// Tipos primitivos n�o tem o operador "."

	}

}
