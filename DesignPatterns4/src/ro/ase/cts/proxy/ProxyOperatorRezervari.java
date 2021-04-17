package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements IOperatorRezervari{
	
	private OperatorRezervari operator;
	private int nrMinimPersoane;


	public ProxyOperatorRezervari(OperatorRezervari operator, int nrMinPers) {
		super();
		this.operator = operator;
		this.nrMinimPersoane=nrMinPers;
	}

	@Override
	public void realizeazaRezervare(String numeClient, int nrPersoane) {
		if(nrPersoane>=nrMinimPersoane) {
			operator.realizeazaRezervare(numeClient, nrPersoane);
		}
		else {
			System.out.println("Va rugam veniti fara rezervare!");
		}
		
	}

}
