package ro.ase.cts.factorymethod;

public class FactoryPortar implements Factory{

	@Override
	public Jucator creeazaJucator(String numeJucator) {
		return new Portar(numeJucator);
	}

}
