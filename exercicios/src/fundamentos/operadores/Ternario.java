package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 4.5;
		String resultadoParcial = media >= 5 ? "em recupera��o" : "reprovado";
		String resultadoFinal = media >= 7 ? "Aprovado" : resultadoParcial;
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.printf("O aluno ter� desconto? %s" , resultado);
		
	}

}
