package EstruturasDeControle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) {
			
			System.out.println("Parabéns! Você foi aprovado!");
		}
		else {
			System.out.println("Aluno Reprovado.");
		}
		entrada.close();

		}
}
