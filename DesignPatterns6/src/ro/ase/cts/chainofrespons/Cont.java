package ro.ase.cts.chainofrespons;

public abstract class Cont {
	private Cont succesor;
	private float sold;
	private String iban;
	
	public Cont(float sold, String iban) {
		super();
		this.sold = sold;
		this.iban = iban;
		this.succesor=null;
	}

	public Cont getSuccesor() {
		return succesor;
	}

	public void setSuccesor(Cont succesor) {
		this.succesor = succesor;
	}

	public float getSold() {
		return sold;
	}

	public void setSold(float sold) {
		this.sold = sold;
	}
	
	public abstract void plateste(float suma);
	

}
