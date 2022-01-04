package Classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribui��o por valor (Tipo primitivo)
		
		a++;
		b--;
		
		//Os valores s�o INDEPENDENTES!!!!!!
		System.out.println("a = " + a) ;
		System.out.println("b = " + b);
		
		
		
		Data d1 = new Data(1,"setembro",2004);
		Data d2 = d1; //atribui��o por refer�ncia (objeto)
		
		d1.dia = 5;
		d2.mes = "abril";
		
		// as duas vari�veis apontam para o mesmo objeto!!
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
	}
	
	static void voltarDataParaValorPadrao (Data d) {
		d.dia = 1;
		d.mes = "janeiro";
		d.ano = 1970;
	}

}
