package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		
		double a = 1;//implícita
		System.out.println(a);
		
		
		//cast = conversão de um tipo primitivo para outro tipo primitivo 
		float b = (float) 1.0;//explícita
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
	}

}
