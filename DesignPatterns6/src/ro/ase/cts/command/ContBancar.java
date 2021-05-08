package ro.ase.cts.command;

public class ContBancar {
	private String iban;
	private float sold;
	
	public ContBancar(String iban, float sold) {
		super();
		this.iban = iban;
		this.sold = sold;
	}
	
	public void constituire(float sumaInitiala) {
		this.sold=sumaInitiala;
		System.out.println("S-a constituit contul cu suma "+sold);
	}
	
	public void retragere(float sumaRetrasa) {
		if(this.sold>=sumaRetrasa) {
			sold-=sumaRetrasa;
			System.out.println("S-au retras "+sold);
		}
		else {
			System.out.println("Fonduri insuficiente!");
		}
	}
	
	public void depunere(float suma) {
		this.sold+=suma;
		System.out.println("S-au depus "+sold);
	}
}
