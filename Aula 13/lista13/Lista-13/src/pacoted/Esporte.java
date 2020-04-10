package pacoted;

public class Esporte {
	private String modalidade;
	private int qtdAtletas;
	private double tempoDuracao;
	
	//GET e SET
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public int getQtdAtletas() {
		return qtdAtletas;
	}
	public void setQtdAtletas(int qtdAtletas) {
		this.qtdAtletas = qtdAtletas;
	}
	public double getTempoDuracao() {
		return tempoDuracao;
	}
	public void setTempoDuracao(double tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
	
	//METODO construtor
	public void informacoes() {
		System.out.println("O esporte " + this.modalidade + " possui " + this.qtdAtletas + " atletas e possui " + this.tempoDuracao + " tempos");
	}

}
