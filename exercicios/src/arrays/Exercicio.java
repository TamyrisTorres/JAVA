package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 10;
		notasAlunoA[1] = 5;
		notasAlunoA[2] = 8;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for(int i = 0; i < notasAlunoA.length;i++) {
			total +=notasAlunoA[i];
		}
		System.out.println(total / 3);
		
		double[] notasAlunoB = {8, 9, 7};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
		
	}

}
