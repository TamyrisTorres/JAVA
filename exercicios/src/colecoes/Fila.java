package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>(); 
		
		//Offer e Add -> adicionam elementos na fila 
		//Diferen�a � o comportamento quando a fila est� cheia!
		
		fila.add("Ana");//retorna falso
		fila.offer("Bia");//lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		//Peek e element --> obter o proximo elementos da fila (sem remover)
		
		//diferen�a � o comportamento ocorre quando a fila est� vazia
		System.out.println(fila.peek());//retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());//lan�a uma exece��o
		System.out.println(fila.element());
		
		//fila.size();
		//fila.clear();
		//fila.isEmptu();
		//fila.contains();
		
		//Poll e remove --> obter o proximo elemento da fila e remove
		
				//diferen�a � o comportamento ocorre quando a fila est� vazia
		System.out.println(fila.poll());//retorna null
		System.out.println(fila.remove());//lan�a uma exece��o
	}

}
