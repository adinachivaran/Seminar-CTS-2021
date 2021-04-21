package ro.ase.cts.observer.program;

import ro.ase.cts.observer.Client;
import ro.ase.cts.observer.Restaurant;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant=new Restaurant("restaurant","Bucuresti");
		
		Client client1=new Client("Ion");
		Client client2=new Client("Mihai");
		Client client3=new Client("Andrei");
		
		restaurant.adaugaObserver(client1);
		restaurant.adaugaObserver(client2);
		
		restaurant.realizareOfertaPret();
		
		restaurant.stergeObserver(client2);
		restaurant.stergeObserver(client3);
		
		restaurant.introducereMeniu();
	}

}
