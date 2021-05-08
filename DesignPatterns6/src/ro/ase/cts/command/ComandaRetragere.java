package ro.ase.cts.command;

public class ComandaRetragere implements IComanda{
	private ContBancar cont;
	private float sumaRetrasa;
	
	public ComandaRetragere(ContBancar cont, float sumaRetrasa) {
		super();
		this.cont = cont;
		this.sumaRetrasa = sumaRetrasa;
	}

	@Override
	public void executa() {
		cont.retragere(sumaRetrasa);
		
	}
	
	

}
