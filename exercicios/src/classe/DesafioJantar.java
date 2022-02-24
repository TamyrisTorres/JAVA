package classe;

public class DesafioJantar {
	
	public static void main(String[] args) {
		
		DesafioPessoa nome1 = new DesafioPessoa("Ricardo", 79.0);		
		
		DesafioComida comida1 = new DesafioComida("Feijão", 0.250);	
		DesafioComida comida2 = new DesafioComida("Arroz", 0.200);
		
		System.out.println(nome1.apresentar());
		
		nome1.Comer(comida2);
		System.out.println(nome1.apresentar());
		
		nome1.Comer(comida1);
		nome1.Comer(comida2);
		System.out.println(nome1.apresentar());
		
		
	}

}
