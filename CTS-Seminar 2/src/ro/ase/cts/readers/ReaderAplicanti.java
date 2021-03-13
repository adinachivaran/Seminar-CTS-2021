package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicanti {
	protected String fileName;
	
    public ReaderAplicanti(String fileName) {
		super();
		this.fileName = fileName;
	}

	public abstract List<Aplicant> citesteAplicanti() throws FileNotFoundException;
    
    public void citesteAplicant(Scanner fisier, Aplicant aplicant) {
    	String nume = fisier.next();
		String prenume = fisier.next();
		int varsta = fisier.nextInt();
		int punctaj = fisier.nextInt();
		int nr = fisier.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++) {
			vect[i] = fisier.next();
		}
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumireProiect(vect, nr);
    }
}
