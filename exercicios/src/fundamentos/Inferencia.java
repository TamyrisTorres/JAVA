package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		//INFER�NCIA - UTILISA "VAR" ANTES DE UMA VARI�VEL, SEM PRECISAR DECLARAR O TIPO. O JAVA IDENTIFICA O TIPO.
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
	}
}
