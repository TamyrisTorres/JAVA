package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Digite seu �ltimos tr�s sal�rios: ");	
	String salario1 = teclado.nextLine().replace(",",".");
	String salario2 = teclado.nextLine().replace(",",".");
	String salario3 = teclado.nextLine().replace(",",".");
	
	teclado.close();
	
	double sal1 = Double.parseDouble(salario1);
	double sal2 = Double.parseDouble(salario2);
	double sal3 = Double.parseDouble(salario3);
	
	System.out.println("A M�dia dos �ltimos tr�s Sal�rios � R$" + (sal1 + sal2 + sal3) / 3);
	
	}
}
