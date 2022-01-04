package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1; // Convers�o implicita int --> double
		System.out.println(a);

		// CAST = tipo + variavel = (tipo o qual vc quer converter) + valor;

		// Convers�o expl�cita double --> float
		float b = (float) 1.4;
		System.out.println(b);

		float b1 = (float) 15.383678176371;// o valor foi truncado e houve perda de informa��o
		System.out.println(b1);

		// Convers�o expl�cita int --> byte
		int c = 129; // Aq o valor foi tuncado,passou de 127. Ele volta do inicio
		byte d = (byte) c; // 4 cabe em byte,mas o Java n�o olha valor, ELE S� OLHA O TIPO!!!!!!
		System.out.println(d);

		// Convers�o expl�cita double --> int
		double e = 1.9999999; // Valor truncado
		int f = (int) e;
		System.out.println(f);
	}

}
