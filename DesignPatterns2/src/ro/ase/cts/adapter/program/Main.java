package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.Bilet;
import ro.ase.cts.adapter.BiletAdapter;
import ro.ase.cts.adapter.BiletOnline;

public class Main {
	
	public static void rezervaSiVindeBiletLaCasa(Bilet bilet)
	{
		bilet.rezerva();
		bilet.vinde();
	}
	
	public static void rezervaSiVindeBiletePePlatforma(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}

	public static void main(String[] args) {
		Bilet b1=new Bilet(20);
		rezervaSiVindeBiletLaCasa(b1);
		
		BiletAdapter biletAdapter=new BiletAdapter(40);
		rezervaSiVindeBiletePePlatforma(biletAdapter);
	
	}
	
	

}
