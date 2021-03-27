package ro.ase.cts.factorymethod;

public class FactoryMijlocas implements Factory{

	@Override
	public Jucator creeazaJucator(String numeJucator) {
		return new Mijlocas(numeJucator);
	}

}
