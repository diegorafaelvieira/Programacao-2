package aula04;

import javax.swing.JOptionPane;

public class TestePainel {

	public static void main(String[] args) {
		String t = JOptionPane.showInputDialog("Nome;");
		if(t == null) {
			System.out.println("Nada foi digitado.");
			
		}  else {	
			System.out.println(t);
		}
	}

}
