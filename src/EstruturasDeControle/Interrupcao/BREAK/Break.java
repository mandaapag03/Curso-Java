package EstruturasDeControle.Interrupcao.BREAK;

public class Break {

	public static void main(String[] args) {
	
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break; // interrompre o laço for e sai dele,indo para o fim do programa.
			}
			
			System.out.println(i);
		}
		System.out.println("Fim!!");
	}

}
