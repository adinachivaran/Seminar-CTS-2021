package ro.ase.cts.template;

public class OcupareMasa extends TemplateOcupareMasa{

	public OcupareMasa(int codMasa) {
		super(codMasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void curataMasa() {
		System.out.println("Masa "+this.codMasa+" este curatata!");
		
	}

	@Override
	public void asazaServetele() {
		System.out.println("Pe masa "+this.codMasa+" s-au asezat servetelele!");
		
	}

	@Override
	public void asazaTacamuri() {
		System.out.println("Pe masa "+this.codMasa+" s-au asezat tacamurile!");
		
	}

	@Override
	public void invitaPersoane() {
		System.out.println("La masa "+this.codMasa+" au fost invitate persoanele!");
		
	}

}
