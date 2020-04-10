package exercicio1;

public class ComparadorCelular  {
	
	
	//comparando os dois objetos 
			public boolean compara(Celular c1,Celular c2) {
				if(c1.modelo.equals(c2.modelo)) {
					System.out.println("Modelos Iguais");
				} else {
					System.out.println("Modelos Diferentes");
				}
				
				
				if(c1.marca.equals(c2.marca)) {
					System.out.println("Marcas Iguais");
				} else {
					System.out.println("Marcas Diferentes");
				}
				return true;
			}
			
		
 }

