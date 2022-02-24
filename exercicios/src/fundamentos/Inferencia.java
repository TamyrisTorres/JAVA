package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		//INFERÊNCIA - UTILISA "VAR" ANTES DE UMA VARIÁVEL, SEM PRECISAR DECLARAR O TIPO. O JAVA IDENTIFICA O TIPO.
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
	}
}
