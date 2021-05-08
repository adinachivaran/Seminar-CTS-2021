package ro.ase.cts.chainofrespons.program;

import ro.ase.cts.chainofrespons.Cont;
import ro.ase.cts.chainofrespons.ContCredit;
import ro.ase.cts.chainofrespons.ContCurent;
import ro.ase.cts.chainofrespons.ContEconomii;

public class Main {

	public static void main(String[] args) {
		Cont contEconomii=new ContEconomii(1000,"RO796566");
		Cont contCredit=new ContCredit(2000,"RO7577866");
		Cont contCurent=new ContCurent(1200,"RO7956786");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		
		contCurent.plateste(400);
		contCurent.plateste(700);
		contCurent.plateste(2000);
		contCurent.plateste(700);
		contCurent.plateste(700);

	}

}
