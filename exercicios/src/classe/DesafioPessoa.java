package classe;

public class DesafioPessoa {

	String nome;
	double peso;

	DesafioPessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void Comer(DesafioComida comida) {
		if(comida != null) {
			this.peso += comida.pesoComida;
		}
	}
	String apresentar() {
		return "Ol? eu sou " + nome + " e tenho " + peso + "kgs.";
	}

}
