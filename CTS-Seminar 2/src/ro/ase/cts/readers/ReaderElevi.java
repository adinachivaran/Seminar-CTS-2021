package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ReaderElevi extends ReaderAplicanti {
	public ReaderElevi(String fileName) {
		super(fileName);
	}

	@Override
	public List<Aplicant> citesteAplicanti() throws FileNotFoundException {
		Scanner fisierElevi = new Scanner(new File(super.fileName));
		fisierElevi.useDelimiter(",|\n");
		List<Aplicant> listaElevi = new ArrayList<Aplicant>();
		while (fisierElevi.hasNext()) {
			Elev elev = new Elev();
		    super.citesteAplicant(fisierElevi, elev);
			int clasa = fisierElevi.nextInt();
			String tutore = fisierElevi.next();
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			listaElevi.add(elev);
		}
		fisierElevi.close();
		return listaElevi;
	}
}
