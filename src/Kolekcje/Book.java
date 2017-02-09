package Kolekcje;

public class Book implements Comparable<Book>{

	private String tytul;
	private int strony;
	private double cena;
	
	public Book(String tytul, int strony, double cena){
		this.tytul = tytul;
		this.strony = strony;
		this.cena = cena;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public int getStrony() {
		return strony;
	}

	public void setStrony(int strony) {
		this.strony = strony;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	
	@Override
	public int compareTo(Book arg0) {
		 //TODO Auto-generated method stub
		return getTytul().compareTo(arg0.getTytul());

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tytul + " " + strony + " "  + cena;
	}
	
	

}


