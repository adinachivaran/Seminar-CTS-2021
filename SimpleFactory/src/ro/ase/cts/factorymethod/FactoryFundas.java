package ro.ase.cts.factorymethod;

public class FactoryFundas implements Factory {

	@Override
	public Jucator creeazaJucator(String numeJucator) {
		return new Fundas(numeJucator);
	}

}
