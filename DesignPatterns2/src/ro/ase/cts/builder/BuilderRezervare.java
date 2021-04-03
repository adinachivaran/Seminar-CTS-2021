package ro.ase.cts.builder;

public class BuilderRezervare implements AbstractBuilderRezervare{
	
	private Rezervare rezervare;
	
	
	public BuilderRezervare() {
		rezervare=new Rezervare(0,false,false,false,false,"");
	}
	
	public BuilderRezervare(int cod) {
		rezervare=new Rezervare(cod,false,false,false,false,null);
	}

	@Override
	public Rezervare build() {
		return rezervare;
	}
	
	public BuilderRezervare setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}

	public BuilderRezervare setAreMancareInclusa(boolean areMancareInclusa) {
		rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}

	public BuilderRezervare setAreBauturaInclusa(boolean areBauturaInclusa) {
		rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}

	public BuilderRezervare setAreScaunEgonomic(boolean areScaunEgonomic) {
		rezervare.setAreScaunEgonomic(areScaunEgonomic);
		return this;
	}

	public BuilderRezervare setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}

	public BuilderRezervare setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}

}
