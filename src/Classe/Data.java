package Classe;

public class Data {
	
	int dia;
	String mes;
	int meses;
	int ano;
	
	Data(){
		this(1, "janeiro", 1970); // s� pode chamar outro construtor dentro de um construtor para setar as variaveis do obj
	}
	
	Data (int dia,String mes, int ano){
		this.dia = dia; // this.dia = vari�vel de inst�ncia / dia = par�metro
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		String formatacao = this.dia + " de " + mes + " de " + ano; 
		return formatacao;
	}
	
	String obterDataFormatada(int meses) {
		String formatacao2 = dia + "/" + meses + "/" + ano;
		return formatacao2;
	}
	
	// Igual na corre��o!!
	String imprimirDataFormatada() {
		return String.format("%d de %s de %d",dia, mes, ano);
	}
	
	String imprimirDataFormatada2() {
		return String.format(this.imprimirDataFormatada());//tbm para chamar m�todos da inst�ncia
	}
}
