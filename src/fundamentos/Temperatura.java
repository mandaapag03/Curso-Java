package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// °C = (°F - 32) * 5/9

		final double SUB = -32;
		final double DIV = 5.0 / 9.0;
		double f = 89;
		double c = (f + SUB) * DIV;

		System.out.println("C = " + c + " °C");

//				System.out.println("C = " + c + " °C"); 				

		// mover = alt + seta p/ baixo ou cima
		// duplicar = ctrl + alt + seta p/ cima ou baixo
	}
}
