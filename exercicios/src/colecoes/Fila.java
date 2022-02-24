package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>(); 
		
		//Offer e Add -> adicionam elementos na fila 
		//Diferença é o comportamento quando a fila está cheia!
		
		fila.add("Ana");//retorna falso
		fila.offer("Bia");//lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		//Peek e element --> obter o proximo elementos da fila (sem remover)
		
		//diferença é o comportamento ocorre quando a fila está vazia
		System.out.println(fila.peek());//retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());//lança uma execeção
		System.out.println(fila.element());
		
		//fila.size();
		//fila.clear();
		//fila.isEmptu();
		//fila.contains();
		
		//Poll e remove --> obter o proximo elemento da fila e remove
		
				//diferença é o comportamento ocorre quando a fila está vazia
		System.out.println(fila.poll());//retorna null
		System.out.println(fila.remove());//lança uma execeção
	}

}
