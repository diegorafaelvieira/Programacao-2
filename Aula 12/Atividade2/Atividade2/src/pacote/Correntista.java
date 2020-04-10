package pacote;

public class Correntista {
	private String nome;
	private float saldo;
	private float credito;
	private float debito;
	
	//Construtores
	public Correntista(String n, float s,float c, float d) {
		nome = n;
		saldo = s;
		credito = c;
		saldo = saldo+credito;
		debito = d;
		saldo = saldo-debito;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getCredito() {
		return credito;
	}
	public void setCredito(float credito) {
		this.credito = credito;
	}
	public float getDebito() {
		return debito;
	}
	public void setDebito(float debito) {
		this.debito = debito;
	}
	
	
	
	
	
	public void Imprimi() {
		System.out.println("O correntista de nome "+this.getNome()+" possuí saldo de R$"+this.getSaldo());
	}
	
}
