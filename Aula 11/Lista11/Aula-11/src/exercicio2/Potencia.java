package exercicio2;



public class Potencia {
	
	
	public int a;
	public int x;
	
	public int elevadoA() {
		
		int potencia = 1, contador = 0;
		while(contador != x)
		{
				potencia = a * a;	
				contador++;
				 
		}
		//System.out.print("O número "+this.a+" elevado à "+this.x+" é igual a: "+ potencia); 
		return(potencia); 
		
	}
	
}
