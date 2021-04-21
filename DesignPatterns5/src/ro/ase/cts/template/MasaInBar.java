package ro.ase.cts.template;

public class MasaInBar extends OcupareMasa{

	public MasaInBar(int codMasa) {
		super(codMasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void asazaTacamuri() {
		System.out.println("Pe masa "+this.codMasa+" s-au asezat paharele!");
		
	}
	
	


}
