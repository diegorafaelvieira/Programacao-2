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
		//System.out.print("O n�mero "+this.a+" elevado � "+this.x+" � igual a: "+ potencia); 
		return(potencia); 
		
	}
	
}
