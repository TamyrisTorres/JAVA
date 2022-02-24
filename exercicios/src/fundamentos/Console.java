package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" Dia!\n");
		
		System.out.println("Bom");
		System.out.println("Dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		
		System.out.printf("Sal�rio: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Jo�o");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		
		String nome = entrada.nextLine();
		
		System.out.println("\n\nNome= " + nome);
		
		entrada.close();
	}
	
}
