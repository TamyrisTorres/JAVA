package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num1 = teclado.nextDouble();
		
		System.out.println("Digite outro número: ");
		double num2 = teclado.nextDouble();
		
		System.out.println("Informe a operação: ");
		String simbolo = teclado.next();
		
		
		double soma = num1 + num2;
		double subtracao = num1 - num2;
		double multiplicacao = num1 * num2;
		double divisao = num1 / num2;
		
		double resultado = "+".equals(simbolo) ? soma : 0;
		resultado = "-".equals(simbolo) ? subtracao : resultado;
		resultado = "*".equals(simbolo) ? multiplicacao : resultado;
		resultado = "/".equals(simbolo) ? divisao : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, simbolo, num2, resultado);
		
		teclado.close();
		
	}

}
