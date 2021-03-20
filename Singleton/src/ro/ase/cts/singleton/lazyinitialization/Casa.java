package ro.ase.cts.singleton.lazyinitialization;

public class Casa {
	private String strada;
	private int nr;
	private int suprafata;
	
	private static Casa instanta=null;

	private Casa(String strada, int nr, int suprafata) {
		super();
		this.strada = strada;
		this.nr = nr;
		this.suprafata = suprafata;
	}

	public void setStrada(String strada) {
		this.strada = strada;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public void setSuprafata(int suprafata) {
		this.suprafata = suprafata;
	}

	public static synchronized Casa getInstance(String strada, int nr, int suprafata) {
		if(instanta==null) {
			instanta=new Casa(strada, nr, suprafata);
		}
		return instanta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Casa [strada=");
		builder.append(strada);
		builder.append(", nr=");
		builder.append(nr);
		builder.append(", suprafata=");
		builder.append(suprafata);
		builder.append("]");
		return builder.toString();
	}
	
	
}
