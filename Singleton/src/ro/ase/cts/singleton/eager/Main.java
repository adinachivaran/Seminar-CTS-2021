package ro.ase.cts.singleton.eager;

public class Main {
  
	public static void main(String[] args) {
	ReceptieHotel receptie1= ReceptieHotel.getInstanta();
	ReceptieHotel receptie2= ReceptieHotel.getInstanta();
	System.out.println(receptie1.toString());
	System.out.println(receptie2.toString());
	receptie1.setNumeReceptioner("Andrei");
	receptie2.setEtaj(4);
	System.out.println(receptie1.toString());
	System.out.println(receptie2.toString());
	
	}
	
}
