package cesar;

import java.util.HashMap;
import java.util.Scanner;

public class ExemploHashMap {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		HashMap<String, Integer> cadastro = new HashMap<String, Integer>();

		cadastro.put("um", 1);
		cadastro.put("dois", 2);
		cadastro.put("tr?s", 3);
		cadastro.put("quatro", 4);
		cadastro.put("cinco", 5);

		String finalizar = "";
		
		do {

			System.out.println("Digite um n?mero de um a cinco.");
			String numeroExtenso = entrada.nextLine();
			

			if (cadastro.containsKey(numeroExtenso)) {
				Integer usuario = cadastro.get(numeroExtenso);
				System.out.println("O seu n?mero ?: " + usuario.intValue()
						+ ". \nMultiplicado por ele mesmo, o resultado ?: " + usuario.intValue() * usuario.intValue());

				System.out.println("\nDeseja encerrar o programa? sim/n?o");

				finalizar = entrada.nextLine();

			} else {
				System.out.println("N?mero Inv?lido. \nDeseja encerrar o programa? sim/n?o");
				finalizar = entrada.nextLine();

			}

			
		} while (!finalizar.equalsIgnoreCase("sim"));

		System.out.println("Obrigado por utilizar nosso c?digo! At? mais. :)");

		entrada.close();
	}
}
