package fundamentos;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		
		Scanner leTeclado = new Scanner(System.in);
		
		double fahrenheit;
		final double X = 32;
		final double Y = 5/9.0;
		double celsius;
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		fahrenheit = leTeclado.nextDouble();
		
		celsius = (fahrenheit - X) * Y;
		
		leTeclado.close();
		System.out.println("Resultado " + celsius + "°C.");
		
	}

}
