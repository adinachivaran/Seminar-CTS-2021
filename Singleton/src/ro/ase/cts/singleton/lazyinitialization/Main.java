package ro.ase.cts.singleton.lazyinitialization;

import ro.ase.cts.singleton.lazyinitialization.ReceptieHotel;

public class Main {
	public static void main(String[] args) {
		ReceptieHotel receptie1=ReceptieHotel.getInstance("Ion",4,"Hotel1");
		ReceptieHotel receptie2=ReceptieHotel.getInstance("Andrei",2,"Hotel2");
		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());
		
		receptie1.setNumeHotel("HOTEEL");
		receptie2.setEtaj(7);
		
	    System.out.println(receptie1);
	    System.out.println(receptie2);
		
	    
	    Casa casa1=Casa.getInstance("Florilor", 3, 300);
	    Casa casa2=Casa.getInstance("Gradinii", 2, 100);
	    System.out.println(casa1.toString());
	    System.out.println(casa2.toString());
	    casa1.setNr(4);
	    casa2.setStrada("Soarelui");
	    System.out.println(casa1);
	    System.out.println(casa2);
		}
}
