package ro.ase.cts.command;

public class ComandaConstituire implements IComanda{
	private ContBancar cont;
	private float sumaInitiala;

	public ComandaConstituire(ContBancar cont, float sumaInitiala) {
		super();
		this.cont = cont;
		this.sumaInitiala = sumaInitiala;
	}

	@Override
	public void executa() {
		cont.constituire(sumaInitiala);
	}
 
}
