package EstruturasDeControle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) {
			
			System.out.println("Parab�ns! Voc� foi aprovado!");
		}
		else {
			System.out.println("Aluno Reprovado.");
		}
		entrada.close();

		}
}