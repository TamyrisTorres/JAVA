package EstruturasDeControle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "#";
		
		for(String v = "#"; !v.equals("#####"); v = "#") {
			System.out.println(valor);
			valor += "#";
		}
	}

}
