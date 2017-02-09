package Kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> lista = new ArrayList<>();
		lista.add(new Book("Ab", 24, 200.0));
		lista.add(new Book("Dc", 22, 215.0));
		lista.add(new Book("Xc", 21, 205.0));
		lista.add(new Book("Aa", 18, 100.0));
		lista.add(new Book("Yx", 26, 300.0));

		Collections.sort(lista);

		for (Book b : lista) {
			System.out.println(b);
		}
		
		System.out.println("Strony:"); 
	
		Collections.sort(lista, new CompareByPages());
		
		for (Book b : lista) {
			System.out.println(b);
		}
		
		System.out.println("Cena:"); 
		
		Collections.sort(lista, new CompareByPrice());
		
		for (Book b : lista) {
			System.out.println(b);
		}
		

	}
	
	private static class CompareByPages implements Comparator<Book> {

		@Override
		public int compare(Book o1, Book o2) {
			if(o1.getStrony() > o2.getStrony()){
				return -1;
			}
			else if (o1.getStrony() == o2.getStrony()){
			return 0;
			}
			return 1;
		}

	}
	
	private static class CompareByPrice implements Comparator<Book> {

		@Override
		public int compare(Book o1, Book o2) {
			if(o1.getCena() > o2.getCena()){
				return -1;
			}
			else if (o1.getCena() == o2.getCena()){
			return 0;
			}
			return 1;
		}

	}
	
}






