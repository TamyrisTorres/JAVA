package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas pretende informar? ");
		double[] notas = new double[entrada.nextByte()];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota: ");
			notas[i] = entrada.nextDouble(); 
			
			//Outra opção seria: 
			//int qtdeNotas = entrada.nextInt();
			//double[] notas = new double[qtdeNotas];
			
			
		}System.out.println(Arrays.toString(notas));
		
		
		double total = 0;
		for(double nota : notas) {
			total += nota;
		}
		System.out.println(total / notas.length);

		entrada.close();

	}

}
