package fundamentos.operadores;


public class DesafioLogicos {
	
	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabaho na Quinta (V ou F)
		//Os dois trabalhos deram certo - comprar TV de 50 polegadas 
		// Um dos dois trabalhos deram certo - comprar TV de 30 polegadas 
		
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		
		System.out.println("Comprou TV 50\"?" + comprouTV50);
		System.out.println("Comprou TV 50\"?" + comprouTV32);
		System.out.println("Comprou sorvete? " + sorvete);
		
		
	}

}
