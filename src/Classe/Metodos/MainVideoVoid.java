package Classe.Metodos;

public class MainVideoVoid {
	public static void main(String[] args) {
		
		darSaudacoes("Amanda");
		
	}
	
	public static void darSaudacoes(String nome) {
		System.out.printf("Seja bem vindo, %s!\n", nome);
		// Com entrada Sem sa�da
		
		/*
		 * Fun��o void � um procedimento,pois n�o tem retorno
		 * apenas EXECUTA uma TAREFA
		 */
	}
	
	public static void darSaudacoes() {
		System.out.println("Seja bem vindo!");
		System.out.println("Deseja fazer login?");
	}
}
