package pacotea;



public class Casa {
	private String cor;
	private int numero;
	private int moradores;
	
	
	
	
	// GET E SET 
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getMoradores() {
		return moradores;
	}

	public void setMoradores(int moradores) {
		this.moradores = moradores;
	}
	
	
	
	// MÉTODO PÚBLICO MORAR
	
		public void morar() {
			
			System.out.print("Na casa de cor "+ this.cor + " de número " + this.numero + " moram " + this.moradores + " pessoas");
		}
	
}
