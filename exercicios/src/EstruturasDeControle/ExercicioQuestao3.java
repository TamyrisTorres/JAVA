package EstruturasDeControle;

import java.util.Scanner;

public class ExercicioQuestao3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota1;
		double nota2;
		double total;

		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();

		total = ((nota1 + nota2) / 2);

		if (total <= 10.0 && total >= 7.0 ) {
			System.out.println("Aluno aprovado!");
		}else if (total > 4.0 && total < 7.0) {
			System.out.println("Aluno em recuperação!");
		}else {
			System.out.println("Aluno reprovado!");
		}

		entrada.close();
	}

}
