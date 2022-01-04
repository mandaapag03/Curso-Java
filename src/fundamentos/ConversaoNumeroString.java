package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {

		// Numero --> String
		Integer num1 = 10000;
		System.out.println(num1.toString());
		
		int a = 1000;
		System.out.println(Integer.toString(a));
		
		System.out.println(("" + a).length());
	}

}
