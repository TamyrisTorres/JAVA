package EstruturasDeControle;

import java.util.Scanner;

public class ExercicioQuestao9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.println("\nDigite um valor: ");
			int valor = entrada.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}
			contador++;

		} while (contador != 10);

		System.out.println("O maior valor digitado foi " + maiorValor);

		entrada.close();
	}

}
