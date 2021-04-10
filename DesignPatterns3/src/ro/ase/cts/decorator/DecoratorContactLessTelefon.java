package ro.ase.cts.decorator;

public class DecoratorContactLessTelefon extends DecoratorAbstract{

	public DecoratorContactLessTelefon(Card card) {
		super(card);
	}

	@Override
	public void platesteContactLess(int suma) {
		if (super.getCard().getSold() > suma) {
			System.out.println("A facut plata ContactLess cu telefonul in suma de: " + suma);
			super.getCard().setSold(super.getCard().getSold() - suma);
		}
	}

}
