package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String ("2");
		System.out.println("2" == s);
		
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String d = entrada.next();
		System.out.println("2" == d.trim());//retira os espa�os em branco
		System.out.println("2".equals(d.trim()));
		
		entrada.close();
		
	}

}
