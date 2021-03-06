package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	Produto() {// construtor padr?o. A classe j? possui esse construtor implicito sem
				// parametros.
	}

	Produto(String nomeInicial, double precoInicial) {// n?o incluir o tipo.
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {

		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoGerente) {

		return preco * (1 - desconto + descontoGerente);
	}

}
