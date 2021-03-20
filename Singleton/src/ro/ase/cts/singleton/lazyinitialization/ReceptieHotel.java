package ro.ase.cts.singleton.lazyinitialization;

import ro.ase.cts.singleton.lazyinitialization.ReceptieHotel;

public class ReceptieHotel {

	private String numeReceptioner;
	private int etaj;
	private String numeHotel;

	private static ReceptieHotel instanta=null;
	
	private ReceptieHotel(String numeReceptioner, int etaj, String numeHotel) {
		super();
		this.numeReceptioner = numeReceptioner;
		this.etaj = etaj;
		this.numeHotel = numeHotel;
	}

	public void setNumeReceptioner(String numeReceptioner) {
		this.numeReceptioner = numeReceptioner;
	}

	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}

	public void setNumeHotel(String numeHotel) {
		this.numeHotel = numeHotel;
	}
	
	
	public static synchronized ReceptieHotel getInstance(String numeReceptioner, int etaj, String numeHotel) {
		if(instanta==null) {
			instanta=new ReceptieHotel(numeReceptioner, etaj, numeHotel);
		}
		return instanta;
	}
	

	public String getNumeReceptioner() {
		return numeReceptioner;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReceptieHotel [numeReceptioner=");
		builder.append(numeReceptioner);
		builder.append(", etaj=");
		builder.append(etaj);
		builder.append(", numeHotel=");
		builder.append(numeHotel);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
