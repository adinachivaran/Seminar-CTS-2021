package ro.ase.cts.singleton.lazyinitialization;

import ro.ase.cts.singleton.lazyinitialization.ReceptieHotel;

public class Main {
	public static void main(String[] args) {
		ReceptieHotel receptie1=ReceptieHotel.getInstance("Ion",4,"Hotel1");
		ReceptieHotel receptie2=ReceptieHotel.getInstance("Andrei",2,"Hotel2");
		
		receptie1.setNumeHotel("HOTEEL");
		receptie2.setEtaj(7);
		
	    System.out.println(receptie1);
	    System.out.println(receptie2);
		
		}
}
