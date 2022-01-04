package fundamentos.ProjetosProprios;

import javax.swing.JOptionPane;

public class NotasDosAlunos2 {
	
	public static void main(String[] args) {
		String nomeDoAluno = JOptionPane.showInputDialog
				("Digite seu nome:") ;
		String disciplina= JOptionPane.showInputDialog
				("Digite a disciplina:") ;
		String primeiroBimestre = JOptionPane.showInputDialog
				("Digite sua nota do 1° bimestre:") ;
		String segundoBimestre = JOptionPane.showInputDialog
				("Digite sua nota do 2° bimestre:") ;
		String terceiroBimestre = JOptionPane.showInputDialog
				("Digite sua nota do 3° bimestre:") ;
		String quartoBimestre = JOptionPane.showInputDialog
				("Digite sua nota do 4° bimestre:") ;
		
		primeiroBimestre = primeiroBimestre.replace(',', '.');
		segundoBimestre = segundoBimestre.replace(',', '.');
		terceiroBimestre = terceiroBimestre.replace(',', '.');
		quartoBimestre= quartoBimestre.replace(',', '.');
		
		Double b1 = Double.parseDouble(primeiroBimestre);
		Double b2 = Double.parseDouble(segundoBimestre);
		Double b3 = Double.parseDouble(terceiroBimestre);
		Double b4 = Double.parseDouble(quartoBimestre);
		
		
		double mediaAnual = (b1 + b2 + b3 + b4) /4 ;
		
		mediaAnual = Math.round(mediaAnual * 10);
		mediaAnual = mediaAnual/10;
	
		System.out.println(nomeDoAluno+",sua média anual de " + disciplina + " é: " + mediaAnual);
	
		if (mediaAnual >= 6) {
			System.out.println("\nParabéns,você foi aprovado!");
		} else {
			System.out.println("\nSinto muito,você foi reprovado!");
		}
		
	}
	
}

