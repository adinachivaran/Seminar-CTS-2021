package ro.ase.cts.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantata=20;
	
	public Student() {
		super();
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, String facultate, int anStudii) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}
	
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}
	
	@Override
	public void afisareSumaFinantata() {
		System.out.println(super.compuneStringSumaFinantata(this.sumaFinantata, "Studentul"));
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Student: ");
		stringBuilder.append("Facultate=").append(this.facultate).append(", AnStudii=").append(this.anStudii);
		return stringBuilder.toString();
	}
}
