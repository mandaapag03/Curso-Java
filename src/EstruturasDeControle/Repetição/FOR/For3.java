package EstruturasDeControle.Repetição.FOR;

public class For3 {

	public static void main(String[] args) {
			//aq a variavel i entá em um escopo associado ao for
		for (int i = 1 ; i < 10 ; i ++) {//variavel;variével tem q ser menor q 10;variavel = variavel + 1	
			System.out.println(i + "\n");
		}
		//aq a variavel i nao está em um escopo 
		//e pode ser utilizada fora do laço for
		int i = 0;
		for (; i < 10 ; i ++) {
			System.out.println(i);
		}
		System.out.println("Saiu do laço for...");
		System.out.println(i);
	}

}