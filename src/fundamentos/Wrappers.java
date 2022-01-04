package fundamentos; //Formatar codigo => ctrl + shift + f

public class Wrappers {
	public static void main(String[] args) {

		// Nome dos tipos primitivos soq começando com letra maiuscula
		Byte b = 100;
		Short s = 1000;
		// Integer.parseInt(digite.next());
		Integer i = 100000; // int
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.doubleValue());
		System.out.println(s.toString().concat(" Litros"));
		System.out.println(i * 3);
		System.out.println(l / 3);

		Float f = 153F;
		System.out.println(f.getClass());

		Double d = 2632.16;
		System.out.println(d);

		Boolean boi = Boolean.parseBoolean("true");
		System.out.println(boi);
		System.out.println(boi.toString().toUpperCase());

		Character c = '#';// char
		System.out.println(c.toString().concat("..."));

	}

}
