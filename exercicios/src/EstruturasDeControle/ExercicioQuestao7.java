package EstruturasDeControle;

import java.util.Scanner;

public class ExercicioQuestao7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int total = 0;

		while (numero >= 0) {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			if (numero >= 0) {
				total += numero;
				System.out.println("Total:  " + total);
			}

		}

		System.out.println("A soma dos números é: " + total);
		System.out.println("Fim!");

		entrada.close();
	}

}
