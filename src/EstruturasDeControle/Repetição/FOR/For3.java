package EstruturasDeControle.Repeti��o.FOR;

public class For3 {

	public static void main(String[] args) {
			//aq a variavel i ent� em um escopo associado ao for
		for (int i = 1 ; i < 10 ; i ++) {//variavel;vari�vel tem q ser menor q 10;variavel = variavel + 1	
			System.out.println(i + "\n");
		}
		//aq a variavel i nao est� em um escopo 
		//e pode ser utilizada fora do la�o for
		int i = 0;
		for (; i < 10 ; i ++) {
			System.out.println(i);
		}
		System.out.println("Saiu do la�o for...");
		System.out.println(i);
	}

}