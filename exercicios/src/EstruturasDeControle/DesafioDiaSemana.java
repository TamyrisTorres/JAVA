package EstruturasDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do dia: ");
		
		String dia = entrada.next();
		
		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println("1");
		}else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println("2");
		}else if ("ter�a".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)){
			System.out.println("3");
		}else if ("Quarta".equalsIgnoreCase(dia)) {
			System.out.println("4");
		}else if ("Quinta".equalsIgnoreCase("5")) {
			System.out.println("5");
		}else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println("6");
		}else if ("S�bado".equalsIgnoreCase(dia) || "Sabado".equalsIgnoreCase(dia)) {
			System.out.println("7");
		}else {
			System.out.println("Dia inv�lido!");
			
		}
		System.out.println("Fim!");
		entrada.close();
	}
}
