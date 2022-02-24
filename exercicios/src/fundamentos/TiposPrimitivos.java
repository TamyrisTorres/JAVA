package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// informa��es do funcion�rio
		
		// Tipos num�ricos inteiros
		
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // true
		
		//Tipo cactere
		char status = 'A'; //Ativo
		
		//Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		System.out.println(numerosDeVoos / 2);
		
		// Numero de Viagens
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha -> " + salario);
		System.out.println("F�rias? "  + estaDeFerias);
		System.out.println("Status: " + status);
		
	
	}

}
