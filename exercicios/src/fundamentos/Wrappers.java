package fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;// int
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l);

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); 
		
		Character C = '#';
		System.out.println(C.toString() + "...");

	}

}
