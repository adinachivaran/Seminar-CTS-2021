package ro.ase.cts.clase;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
	private static int sumaFinantata=30;
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public void setClasa(int i) {
		this.clasa = i;
	}
	
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
		
	@Override
	public void afisareSumaFinantata() {
		System.out.println(super.compuneStringSumaFinantata(this.sumaFinantata, "Elevul"));
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Elev: ");
		stringBuilder.append("Clasa=").append(this.clasa).append(", Tutore=").append(this.tutore);
		return stringBuilder.toString();
	}
}
