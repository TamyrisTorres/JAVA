package EstruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nome = "";

		while (!nome.equalsIgnoreCase("Sair")) {

			System.out.println("Digite seu nome: ");
			nome = entrada.nextLine();

		}

		entrada.close();
	}

}
