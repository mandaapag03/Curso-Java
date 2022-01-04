package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {

		double raio = 3.5; // variável
		final double PI = 3.14; // constante (final...) (Constantes com letra maiuscula)

		System.out.println(PI * raio * raio);

		// ou ainda

		double area = PI * raio * raio;

		System.out.println(area);

		raio = 10; // "Uma vez definido o tipo da variavel vc nao precisa indicar mais"
		area = PI * raio * raio;
		System.out.println("Área = " + area);
	}
}
