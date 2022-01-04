package Classe.DesafioDoModulo;

public class Pessoa {
	
	String nomePessoa;
	double pesoPessoa;
	
	Pessoa (String nomePessoa,double pesoPessoa){
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	double comer(Comida comida) {
		return pesoPessoa += comida.pesoComida ;
	}
	
	void comerVoid (Comida comida) {
		pesoPessoa += comida.pesoComida;
	}
}
