package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {

		dia = 1;
		mes = 1;
		ano = 1970;

	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {
		String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);

	}

	void imprimirDataFormatada() {// Esse metodo n�o funciona em desktop, em mobile e outros. melhor op��o � o
									// metodo acima.
		System.out.println(this.obterDataFormatada());
	}

}