package fundamentos.ProjetosProprios;

public class ExplorandoTipoString {

	public static void main(String[] args) {

		String j1 = "Dark Souls %s";
		String j2 = "Dark Souls e The Wicher 3";
		String j3 = "GTA San Andreas";
		String spt = "a,b,c,d,e,f";
		String espacoVazio = "     gatinho    ";
		String obj = new String();
		obj = "Amo gatos";
		obj = obj.intern();
		System.out.println(obj);

		StringBuffer a = new StringBuffer();
		a.append("Me and your girlfriend "); // append=>Sequencia de caracteres
		a.append("playin' dress up ");
		a.append("at my house\n");
		a.append("Dark Souls");
		System.out.println(a);

		System.out.println(j1.charAt(1) + " -->.charAt");
		System.out.println(j1.codePointAt(2) + "-->.codePointAt");// Valor de ponto de código
		System.out.println(j1.codePointBefore(1) + "-->.codePointBefore");// valor do ponto de codigo anterior
		System.out.println(j1.codePointCount(1, 9) + "-->.codePointCount");
		System.out.println(j1.compareTo(j2) + "-->.compareTo");
		System.out.println(j1.compareToIgnoreCase(j2) + "-->.compareToIgnoreCase");
		System.out.println(j1.concat(" " + j2) + "-->.concat");
		System.out.println(j2.contains(j1) + "-->.contains");
		System.out.println(j1.contentEquals(j2) + "-->.contentEquals");
		System.out.println(j1.contentEquals(a) + "-->.contentEquals");
		System.out.println(j1.endsWith("Souls") + "-->.endsWith");
		System.out.println(j1.equals(j1) + "-->.equals");
		System.out.println(j1.equalsIgnoreCase(j1) + "-->.equalsIgnoreCase");
		System.out.println(j1.formatted(j3) + "-->.formatted");
		System.out.println(j1.hashCode() + "-->.hashCode");

		// AS MAIS USADAS -->VIDEO: Java-Aula 23- Os principais métodos da classer
		// String:
		System.out.println("\n\n");
		System.out.println(j1.toUpperCase() + "-->.toUpperCase");
		System.out.println(j1.toLowerCase() + "-->.toLowerCase");
		System.out.println(j1.length() + "-->.length");
		System.out.println("-->.split");
		String[] letras = spt.split(",");
		System.out.println(letras[0]);
		System.out.println(letras[1]);
		System.out.println(letras[2]);
		System.out.println(letras[3]);
		System.out.println(letras[4]);
		System.out.println(espacoVazio.trim() + "-->.trim");
		System.out.println(j3.replaceAll("a", "0") + "-->.replaceAll");

	}

}
