package exemplos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Teste {
	public static void main(String[] args) {
		
		// Numero de elementos
		int n = 100000;
		String s = "String!";
		
		LinkedList<String> ll = new LinkedList<String>();
		ArrayList<String> al = new ArrayList<String>();
		
		
		
		
		/**
		 * TESTE DE INSERCAO
		 * Inicio, Final e Ambas
		 */
		
		long t1 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			//ll.addFirst(s);
			ll.addLast(s);
		}
		long t2 = System.nanoTime();

		long t3 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			//al.add(0,s);
			al.add(s);
		}
		long t4 = System.nanoTime();
		
		System.out.println("------Insercao------");
		System.out.println("LinkedList: " + (t2-t1));
		System.out.println("ArrayList:  " + (t4-t3));
		System.out.println();
		
		
		
		
		/**
		 * TESTE DE RECUPERACAO COM GET
		 * Inicio, Final e Meio
		 */
		
		t1 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			ll.getFirst();
			//ll.getLast();
			//ll.get(n/2);
		}
		t2 = System.nanoTime();
		
		t3 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			al.get(0);
			//al.get(al.size()-1);
			//al.get(n/2);
		}
		t4 = System.nanoTime();
		
		System.out.println("--------Get-------");
		System.out.println("LinkedList: " + (t2-t1));
		System.out.println("ArrayList:  " + (t4-t3));
		System.out.println();
		
		
		
		/**
		 * TESTE DE REMOCAO
		 * Inicio e Final
		 */
		
		t1 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			ll.removeFirst();
			//ll.removeLast();
		}
		t2 = System.nanoTime();
	
		t3 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			al.remove(0);
			//al.remove(al.size()-1);
		}
		t4 = System.nanoTime();
		
		System.out.println("------Remocao------");
		System.out.println("LinkedList: " + (t2-t1));
		System.out.println("ArrayList:  " + (t4-t3));
		System.out.println();
	}

}
