package EstruturasDeControle;

import java.util.Scanner;

public class DoWhile {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String pedido = "";
		String finalizar = "";
		

		do {
			System.out.println("Fa?a seu pedido: ");
			pedido = entrada.nextLine();
			
			System.out.println("Seu pedido foi: " + pedido);
			
			System.out.println("Deseja pedir algo mais? ");
			finalizar = entrada.nextLine();
			
			
		}while(!finalizar.equalsIgnoreCase("n?o"));
		
		System.out.println("Pedido encerrado!");

		
		entrada.close();
	}
}
