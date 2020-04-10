package exemplos;



public class TesteCarro {
	//Aqui começa a executar o programa
	public static void main(String[] args) {
		
		
		
		Carro c1 = new Carro();
		c1.marca = "VW";
		c1.modelo = "Jetta";
		c1.ano = 2010;
		c1.andar();
		
		Carro c2 = new Carro();
		c2.marca = "Ford";
		c2.modelo = "Fusion";
		c2.ano = 2015;
		c2.andar();
		
		
		
	}

}
