package ro.ase.cts.builder;

public class BuilderRezervare2 implements AbstractBuilderRezervare{
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunEgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	public BuilderRezervare2() {
		this.codRezervare=0;
		this.areBauturaInclusa=false;
		this.areMancareInclusa=false;
		this.areScaunEgonomic=false;
		this.areMuzicaAmbientala=false;
		this.genMuzica=null;
	}

	@Override
	public Rezervare build() {
		return new Rezervare(codRezervare, areMancareInclusa,areBauturaInclusa,areScaunEgonomic,areMuzicaAmbientala, genMuzica);
	}

	public BuilderRezervare2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public BuilderRezervare2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}

	public BuilderRezervare2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
		return this;
	}

	public BuilderRezervare2 setAreScaunEgonomic(boolean areScaunEgonomic) {
		this.areScaunEgonomic = areScaunEgonomic;
		return this;
	}

	public BuilderRezervare2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}

	public BuilderRezervare2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	
}
