package EstruturasDeControle;

import java.util.Scanner;

public class ExercicioQuestao1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int numero = entrada.nextInt();

		if (numero <= 10 && numero >= 0) {
			if (numero % 2 == 0) {
				System.out.println("O n�mero digitado est� entre 0 e 10 e � um n�mero par!");
			} else {
				System.out.println("O n�mero digitado n�o est� entre 0 e 10 ou n�o � um n�mero par!");

			}
		}

		entrada.close();
	}
}
