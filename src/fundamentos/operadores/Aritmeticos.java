package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {

		var x = 162.4;
		double y = 272.45;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);

		int a = 8;
		int b = 14;
		System.out.println(a + b);
		System.out.println(a - (float) b);
		System.out.println(a * b);
		System.out.println(a / (double) b); // Cast

		// Módulo = Resto da divisão.
		System.out.println(8 % 3);
		System.out.println(a % b);

		System.out.println(x + y - a / b);

		int d = 3 * 4 - 10;
		int e = (int) Math.pow(d, 4);
		double f = Math.pow(d, 4);
		/*
		 * Math.pow(double1,double2)-->Potenciação Sempre irá gerar um valor double.
		 * Portanto é necessario ou usar uma variável double ou usar um cast do tipo que
		 * vc quer.
		 */
		System.out.println(e);
		System.out.println(f);
	}

}
