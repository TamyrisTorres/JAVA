package EstruturasDeControle;

import java.util.Scanner;

public class ExercicioQuestao6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero = 25;
		int tentativa = 3;
		int numeroAdvinha = 0;
		String iniciar;

		System.out.println(
				"Vamos brincar de Advinhar?\nVoc? precisa descobrir em qual n?mero estou pensando. \nEst? pronto? Sim/N?o");
		iniciar = entrada.next().toUpperCase();

		if (iniciar.equalsIgnoreCase("sim")) {

			do {
				System.out.println("Digite um n?mero de 0 a 100: ");
				numeroAdvinha = entrada.nextInt();

				if (numeroAdvinha == numero) {
					System.out.println("Parab?ns! Voc? acertou! ;P");
				} else if (numeroAdvinha != numero) {
					System.out.println("Voc? Errou!");
					tentativa--;
					System.out.printf("Voc? tem mais %d tentativas!\n", tentativa);
				}

			} while (numeroAdvinha != numero && tentativa != 0);
		}
		
		else if (iniciar.equalsIgnoreCase("n?o")){
			System.out.println("OK! Good Bye! :(");
		}

		entrada.close();

	}

}
