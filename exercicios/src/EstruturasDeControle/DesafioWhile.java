package EstruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota = 0.0;
		int quantidadeDeNotasValidas = 0;
		double total = 0;

		while(nota != -1) {
		
				System.out.println("Informe a Nota: ");
				nota = entrada.nextDouble();
			
					if(nota <= 10 && nota >= 0) {
						total += nota;
						quantidadeDeNotasValidas++;
						
					}else if (nota != -1) {
						System.out.print("Por favor digite uma nota v?lida!");
					}
			
			}
		
		//Calculando a m?dia
		double media = total / quantidadeDeNotasValidas;
		
		System.out.println("A m?dia das notas ?: " + media);
		System.out.println("A quantidades de notas v?lidas: " + quantidadeDeNotasValidas);

		entrada.close();
	}
}
