package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lista = new ArrayList<String>();
		lista.add("mysz");
		lista.add("chomik");
		lista.add("œwinka morska");
		lista.add("kret");
		lista.add("gowno");
		if (isRepeatable(lista))
			System.out.println("TAK");
		else
			System.out.println("NIE");
	}

	public static boolean isRepeatable(List<String> spis) {
		int i = 0;
		while (spis.size() > 1) {
			String el = spis.get(i);
			spis.remove(el);
			if (spis.contains(el))
				return true;
		}
		return false;
	}
}
