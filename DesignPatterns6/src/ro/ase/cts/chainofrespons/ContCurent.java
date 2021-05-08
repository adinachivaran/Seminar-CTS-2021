package ro.ase.cts.chainofrespons;

public class ContCurent extends Cont{

	public ContCurent(float sold, String iban) {
		super(sold, iban);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>=suma) {
			super.setSold(super.getSold()-suma);
			System.out.println("S-a realizat plata din contul curent cu suma "+suma);
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
