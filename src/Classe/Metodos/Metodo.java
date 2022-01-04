package Classe.Metodos;

public class Metodo {
	
	public static void main(String[] args) {
		
		System.out.println(Metodo.somar(0, 0));
		
		Metodo.mostrarPadrao();
		Metodo.mostrar(6, 8);
		
		Metodo.mostrarNumero();
		
		MainVideoVoid.darSaudacoes("João");
		MainVideoVoid.darSaudacoes();
	}
	
	//Tem entrada e saída
	static int somar(int a,int b) {
		int resultado = a + b;
		return resultado;
	}
	
	//Tem entrada 
	static void mostrar(int c,int d) {
		System.out.println("c = " + c);
		System.out.println("d = " + d);	
	}
	
	//Apenas saída
	static int mostrarNumero() {
		int numero1 = 1;
		return numero1;
	}
	// Nem entrada e nem saida
	static void mostrarPadrao() {
		mostrar(0, 0);
	}
}
