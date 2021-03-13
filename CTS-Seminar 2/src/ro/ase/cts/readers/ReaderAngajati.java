package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class ReaderAngajati extends ReaderAplicanti{
	public ReaderAngajati(String fileName) {
		super(fileName);
	}

	@Override
	public List<Aplicant> citesteAplicanti() throws FileNotFoundException {
		Scanner fisierAngajati = new Scanner(new File(super.fileName));
		fisierAngajati.useDelimiter(",");
		List<Aplicant> listaAngajati = new ArrayList<Aplicant>();
		while (fisierAngajati.hasNext()) {
			Angajat angajat = new Angajat();
		    super.citesteAplicant(fisierAngajati, angajat);
			int salariu = fisierAngajati.nextInt();
			String ocupatie = fisierAngajati.next();
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			listaAngajati.add(angajat);
		}
		fisierAngajati.close();
		return listaAngajati;
	}		
}
