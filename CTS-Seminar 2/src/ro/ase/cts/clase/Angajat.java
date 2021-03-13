package ro.ase.cts.clase;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static int sumaFinantata=10;
	
	public Angajat() {
		super();
	}
	
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte, int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	
	@Override
	public void afisareSumaFinantata() {
		System.out.println(super.compuneStringSumaFinantata(this.sumaFinantata, "Angajatul"));
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Angajat: ");
		stringBuilder.append(super.toString()).append(", Ocupatie=").append(this.ocupatie).append(", salariu=").append(this.salariu);
		return stringBuilder.toString();
	}
}
