package arrays;

public class ExercicioForeach {
	
	public static void main(String[] args) {
		
		
		String[] alunos = new String[4];
		alunos[0] = "Tamyris";
		alunos[1] = "Jose";
		alunos[2] = "Miguel";
		alunos[3] = "Pedro";
		
		for(String aluno : alunos) {
			System.out.println(aluno + " ");
		}
	}

}
