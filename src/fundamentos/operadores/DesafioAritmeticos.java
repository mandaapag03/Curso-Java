package fundamentos.operadores;

public class DesafioAritmeticos  {
	
	public static void main(String[] args) {
		 
		double a1 = 3 + 2;
		double b1 = 6 *(a1);
		double c1 = Math.pow(b1,2);
		double d1 = 3 * 2;
		double e1 = c1 / d1;
		
		double a2 = 1 - 5;
		double b2 = 2 - 7;
		double c2 = a2 * b2;
		double d2 = c2 / 2;
		double e2 = Math.pow(d2, 2);
		
		double subtracao = e1 - e2;
		double emcima = Math.pow(subtracao, 3);
		double total = emcima / Math.pow(10,3);
		System.out.println("x = " + total);
	
		
		
	}

}
