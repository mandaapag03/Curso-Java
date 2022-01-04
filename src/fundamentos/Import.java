package fundamentos;

//--> precisou importar um recurso p/ exibir data fora da classe.
import java.util.Date;
//import javax.swing.JButton;

//Ctrl + shift + O = Organiza os imports
public class Import {

	public static void main(String[] args) {
		// java.lang é o caminho ate aq
		java.lang.String a = "Boa Noite!!";
		java.lang.System.out.println(a);

		Date d = new Date();
		System.out.println(d);

//		JButton botao = new JButton();

	}

}
