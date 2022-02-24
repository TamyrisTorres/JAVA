package EstruturasDeControle;

import java.util.Scanner;

public class ExercicioQuestao4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;
		int contadorDedivisores = 0;

		System.out.println("Digite um número: ");
		numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDedivisores++;
			}
		}
		if(contadorDedivisores == 0) {
			System.out.println("\nO número " + numero + " é primo.");
		}else {
			System.out.println("\nO número " + numero + "não é primo.");
		}
		entrada.close();
	}

}
