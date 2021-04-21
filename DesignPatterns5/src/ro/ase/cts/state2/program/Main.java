package ro.ase.cts.state2.program;

import ro.ase.cts.state2.Masa;
import ro.ase.cts.state2.StareLibera;

public class Main {

	public static void main(String[] args) {
		Masa masa=new Masa(10);
		masa.ocupaMasa();
		masa.rezervaMasa();
		//masa.setStare(new StareLibera());
		//masa.rezervaMasa();
		masa.elibereazaMasa();

	}

}
