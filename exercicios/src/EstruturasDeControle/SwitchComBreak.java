package EstruturasDeControle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {

		int nota;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a nota: ");
		nota = entrada.nextInt();

		switch (nota) {
		case 10:
		case 9:
			System.out.println("Conceito A!");
			break;
		case 8:
		case 7:
			System.out.println("Conceito B!");
			break;
		case 6:
		case 5:
			System.out.println("Conceito C!");
			break;
		case 4:
		case 3:
			System.out.println("Conceito D!");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("Conceito E!");
			break;
		default:
			System.out.println("Nota inválida!");
		}
		System.out.println("Fim!");

		entrada.close();

	}

}
