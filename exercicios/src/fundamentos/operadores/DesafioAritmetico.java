package fundamentos.operadores;

public class DesafioAritmetico {

	public static void main(String[] args) {

		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		double superiorA = numA / denA;

		double superiorB = Math.pow(((1 - 5) * (2 - 7) / 2), 2);

		double superior = Math.pow((superiorA - superiorB), 3);
		double inferior = Math.pow(10, 3);

		double resultadoFinal = superior / inferior;

		System.out.println("O resultado é " + resultadoFinal);

	}

}
