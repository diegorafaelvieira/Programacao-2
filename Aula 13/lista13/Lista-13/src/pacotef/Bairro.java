package pacotef;

public class Bairro {
	private String nome;
	private int habitantes;
	private int numeroDeCasas;
	
	//GET e SEt
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHabitante() {
		return habitantes;
	}
	public void setHabitante(int habitantes) {
		this.habitantes = habitantes;
	}
	public int getNumeroDeCasas() {
		return numeroDeCasas;
	}
	public void setNumeroDeCasas(int numeroDeCasas) {
		this.numeroDeCasas = numeroDeCasas;
	}
	
	//Metodo construção
	public Bairro (String n,int h,int nc) {
		nome = n;
		habitantes = h;
		numeroDeCasas = nc;
	}
	
	public void informacoes() {
		System.out.println("O bairro "+this.nome+" possui "+this.habitantes+" habitantes e "+this.numeroDeCasas+" casas");
	}

}
