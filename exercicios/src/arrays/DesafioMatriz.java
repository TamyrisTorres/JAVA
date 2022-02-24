package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMatriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantidade de alunos: ");
		int qntdAlunos = entrada.nextInt();

		System.out.println("Quantidade de Notas: ");
		int qntdNotas = entrada.nextInt();

		double[][] notasTurma = new double[qntdAlunos][qntdNotas];

		double total = 0;
		for (int a = 0; a < notasTurma.length; a++) {
			for (int n = 0; n < notasTurma[a].length; n++) {
				System.out.printf("Digite a nota %d do aluno %d: ", (n + 1), (a + 1));
				notasTurma[a][n] = entrada.nextDouble();
				total += notasTurma[a][n];

			}

		}

		double media = total / (qntdAlunos * qntdNotas);
		System.out.println("A média da turma: " + media);

		for (double[] notasAlunos : notasTurma) {
			System.out.println(Arrays.toString(notasAlunos));
		}
		
		entrada.close();
	}

}
