package ro.ase.cts.simplefactory;

public class Atacant extends Jucator{

	public Atacant(String numeJucator) {
		super(numeJucator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant []").append(super.toString());
		return builder.toString();
	}

	
}
