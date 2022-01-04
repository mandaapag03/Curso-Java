package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
//Informa�oes do funcion�rio:

//Tipos num�ricos inteiros:

		byte anosDeEmpresa = 32;
		short numeroDeVoos = 548;
		int id = 162_533;
		long pontosAcumulados = 3_128_839_938L;
		// se ele passar do valor aceito no int,deve-se por um L (ou l) p/ ser long

//Tipos numericos Pontos flutuantes (Reais):

		// se ele passar do valor aceito no float,e ser um valor double,deve-se por um F
		// (ou f) p/ ser float
		float salario = 11_644.44F;
		double vendasAcumuladas = 2_282_828.03;

//Tipo Booleano:

		boolean estaDeFerias = true; // false

// Tipo Caractere: (aceita um caractere)
		char status = 'A'; // A = ativo I = Inativo

		// DIAS DE EMPRESA:
		System.out.println(anosDeEmpresa * 365 + " Dias de empresa");

		// N�MERO DE VIAGENS:
		System.out.println(numeroDeVoos / 2 + " Viagens");
		// PONTOS POR REAL:
		System.out.println(pontosAcumulados / vendasAcumuladas + " pontos");
		// SALARIO DO FUNCION�RIO:
		System.out.println("O ID " + id + " ganha um sal�rio de " + salario + " Reais por m�s");
		// EST� DE F�RIAS?
		System.out.println("Est� de f�rias? " + estaDeFerias);
		// STATUS
		System.out.println("Status do funcion�rio: " + status);

	}

}
