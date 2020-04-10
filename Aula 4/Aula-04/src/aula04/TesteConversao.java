package aula04;

import javax.swing.JOptionPane;

public class TesteConversao {

	public static void main(String[] args) {
		//ATENÇÃO       JOptionPane sempre lê como uma String o número
		String n = JOptionPane.showInputDialog("Numero:"); 
		int i =Integer.parseInt(n);
		i = i + 10;
		System.out.println(i);

		
		String n2 = JOptionPane.showInputDialog("Double:"); 
		double d =Double.parseDouble(n2);
		d = d * 2;
		System.out.println(d);
	}

}
