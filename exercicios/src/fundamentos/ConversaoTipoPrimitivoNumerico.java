package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		
		double a = 1;//impl�cita
		System.out.println(a);
		
		
		//cast = convers�o de um tipo primitivo para outro tipo primitivo 
		float b = (float) 1.0;//expl�cita
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
	}

}
