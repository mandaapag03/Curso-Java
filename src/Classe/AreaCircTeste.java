package Classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		System.out.println(a1.area());
		
		// Sem intância do a2...
		System.out.printf("a2 = %.2f m2\n", AreaCirc.area(5)); 
		
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}
}
