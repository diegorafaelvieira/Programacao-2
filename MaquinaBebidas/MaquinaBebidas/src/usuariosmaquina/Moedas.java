package usuariosmaquina;

public class Moedas {

	//atributos
	private int qtd5;
	private int qtd10;
	private int qtd25;
	private int qtd50;
	private int qtd1;
	private double valorPago;
	private double valorTroco;
	private double valorFalta;
	
	//construtor
	public Moedas(int qtd5,int qtd10,int qtd25, int qtd50, int qtd1) {
		super();
		this.qtd5 = qtd5;
		this.qtd10 = qtd10;
		this.qtd25 = qtd25;
		this.qtd50 = qtd50;
		this.qtd1 = qtd1;
		
	}

	//GET e SET
	public int getQtd5() {
		return qtd5;
	}

	public void setQtd5(int qtd5) {
		this.qtd5 = qtd5;
	}
	
	public int getQtd10() {
		return qtd10;
	}

	public void setQtd10(int qtd10) {
		this.qtd10 = qtd10;
	}
	
	public int getQtd25() {
		return qtd25;
	}

	public void setQtd25(int qtd25) {
		this.qtd25 = qtd25;
	}

	public int getQtd50() {
		return qtd50;
	}

	public void setQtd50(int qtd50) {
		this.qtd50 = qtd50;
	}

	public int getQtd1() {
		return qtd1;
	}

	public void setQtd1(int qtd1) {
		this.qtd1 = qtd1;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getValorTroco() {
		return valorTroco;
	}

	public void setValorTroco(double valorTroco) {
		this.valorTroco = valorTroco;
	}

	public double getValorFalta() {
		return valorFalta;
	}

	public void setValorFalta(double valorFalta) {
		this.valorFalta = valorFalta;
	}
	
	//conta a quantidade de moedas de R$0,05
	public double cont5(){
	        return qtd5*0.05;
	    }
	
	//conta a quantidade de moedas de R$0,10
	public double cont10(){
	        return qtd10*0.10;
	    }
	
	//conta a quantidade de moedas de R$0,25
	public double cont25(){
        return qtd25*0.25;
    }
	
	//conta a quantidade de moedas de R$0,50
	public double cont50(){
        return qtd50*0.50;
    }
	
	//conta a quantidade de moedas de R$1,00
	public double cont1(){
        return qtd1*1.00;
    }
	
	//conta valor pago
	public double valorPago() {
		valorPago += cont5();
		valorPago += cont10();
		valorPago += cont25();
		valorPago += cont50();
		valorPago += cont1();
		System.out.println("Valor pago: " + valorPago);
		return valorPago;
	}
	
	//calcula troco e falta de moedas
	public void devolverTroco (double valorBebida, double valorPago) {
		//recebe troco se precisar
		if(valorPago > valorBebida) {
			double v = valorPago - valorBebida;
			System.out.println("Valor do troco: R$ " + v);
			this.valorTroco = v;
		}
		// se o valor pago for o mesmo valor da bebida
		else if (valorPago == valorBebida) {
			System.out.println("Valor troco: R$ 0");
			this.valorTroco = 0;
		}
		// se faltar valor para efetuar a compra
		else {
			double valorFalta = valorBebida - valorPago;
			System.out.println("Falta inserir o valor de R$ " + valorFalta);
			this.valorTroco = 0;
			this.valorFalta = valorFalta;
		}
	}
}
