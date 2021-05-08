package ro.ase.cts.chainofrespons;

public class ContCredit extends Cont{

	public ContCredit(float sold, String iban) {
		super(sold, iban);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>=suma) {
			super.setSold(super.getSold()-suma);
			System.out.println("S-a realizat plata din contul de credit cu suma "+suma);
		}
		else {
			if(super.getSuccesor()!=null) {
				super.getSuccesor().plateste(suma);
			}
			else {
				System.out.println("Plata nu se poate realiza!");
			}
		}
		
	}

}
