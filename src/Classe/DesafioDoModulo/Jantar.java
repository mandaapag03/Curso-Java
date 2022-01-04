package Classe.DesafioDoModulo;

public class Jantar {
	public static void main(String[] args) {

		Pessoa Amanda = new Pessoa("Amanda", 90.0);

		Comida Coxinha = new Comida("Coxinha de 1KG", 1.0);
		Comida CocaCola = new Comida("Coca-Cola", 0.5);

		System.out.println("Peso inicial -");
		System.out.printf("Amanda - %.2f\n", Amanda.pesoPessoa);

		System.out.println("Peso depois do jantar - ");
		Amanda.comer(CocaCola);
		Amanda.comer(Coxinha);
		System.out.printf("Amanda - %.2f KG\n", Amanda.pesoPessoa);
		
		Amanda.comerVoid(CocaCola);
		Amanda.comerVoid(Coxinha);
		System.out.printf("Amanda - %.2f KG\n", Amanda.pesoPessoa);
		
	}
}
