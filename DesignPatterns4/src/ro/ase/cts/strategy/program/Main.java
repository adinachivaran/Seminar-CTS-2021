package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.Client;
import ro.ase.cts.strategy.PlataCard;
import ro.ase.cts.strategy.PlataCash;

public class Main {

	public static void main(String[] args) {
		/* trebuie implementate si card si cash, asta inseamna strategy */
		Client client=new Client("Gigel",new PlataCard());
		client.platesteNota(200);
		client.setModPlata(new PlataCash());
		client.platesteNota(20);
	}

}
