package Classe;

public class DataMain {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data(31,"dezembro",2031);
		Data d4 = new Data();
		
		System.out.println("Datas Legais");
		
		//d1
		d1.dia = 14;
		d1.mes = " junho ";
		d1.ano = 1789;
		
		//d2
		d2.dia = 7;
		d2.mes = " novembro ";
		d2.ano = 2003;
				
		
		System.out.println("Revolução francesa - " + d1.obterDataFormatada());
		
		System.out.println("Meu nascimento - "
				+ d2.obterDataFormatada(11));
		
		System.out.println(d3.imprimirDataFormatada());
		
		String dataFormatada = d4.imprimirDataFormatada2();
		System.out.println(dataFormatada);                                                   
	}
}
