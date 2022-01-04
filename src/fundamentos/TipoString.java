package fundamentos;

public class TipoString {

	public static void main(String[] args) {

		// .charAt(int) => mostra qual é a letra conforme o índice informado nos
		// parenteses.
		System.out.println("Hi Lorenah!!".charAt(1));

		String s = "hi rau ari u";
		s = s.toUpperCase();
		// .startsWith(String prefix) => se a string começa com oq foi colocado entre
		// parenteses.
		// .endsWith(Sting suffix) => se a string termina com oq foi colocado entre
		// parenteses.
		System.out.println(s.concat("??"));
		System.out.println(s.toLowerCase().startsWith("hi"));
		System.out.println(s.toUpperCase().startsWith("HI"));
		System.out.println(s.endsWith("U"));
		System.out.println(s.length());
		// .length(int) => indica o tamanho da string
		System.out.println(s.equals("HI RAU ARI U"));
		System.out.println(s.toUpperCase().equalsIgnoreCase("hi rau ari u"));

		var nome = "Amanda";
		var sobrenome = "Pagani Lima";
		var idade = 18;
		var turma = 272_777F;

		System.out.println(nome.toUpperCase().concat(sobrenome).toUpperCase() + "\n" + idade + " anos" + "\n"
				+ "Turma: " + turma + "\n\n");
		// Jeito mais simples de escrever uma string no console: %s
		System.out.printf("Nome: %s %s", nome, sobrenome);
		System.out.printf("\nIdade: %d", idade);
		System.out.printf("\nTurma: %f", turma);
		System.out.println("\n\n");

		System.out.printf("A aluna %s %s tem %d anos \ne é da turma %.1f", nome, sobrenome, idade, turma);

		String frase = String.format("\n\nA aluna %s %s tem %d anos \ne é da turma %.1f", nome, sobrenome, idade,
				turma);
		System.out.println(frase);

		String oQueSintoAgora = "\nEu não aguento mais tomar café!!";
		System.out.println(oQueSintoAgora);
		System.out.println(oQueSintoAgora.contains("a")); // Se há na string "a"
		System.out.println(oQueSintoAgora.indexOf("é")); // Qual posição está o "é"
		System.out.println(oQueSintoAgora.substring(4, 15));// O que está entre as posições 4 e 15 da string (range do 4
															// ao 14)
	}

}
