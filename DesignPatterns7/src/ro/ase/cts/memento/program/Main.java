package ro.ase.cts.memento.program;

import ro.ase.cts.memento.ManagerMemento;
import ro.ase.cts.memento.MeciJucat;
import ro.ase.cts.memento.Memento;

public class Main {
	
	public static void main(String[] args) {
		MeciJucat meciJucat=new MeciJucat("Echipa 1", "Oaspeti echipa", 200, 300, 40, 20);
		Memento memento=meciJucat.creareMemento();
		
		ManagerMemento managerMemento=new ManagerMemento();
		managerMemento.adaugaMemento(memento);
		
		meciJucat.setNumarSpectatori(7500);
		meciJucat.setNumarBileteVandute(2700);
		meciJucat.setNumeEchipaGazda("Real");
		meciJucat.setNumeEchipaOaspeti("FCSB");
		
		managerMemento.adaugaMemento(meciJucat.creareMemento());
		System.out.println(meciJucat.toString());
		
		meciJucat.setMemento(managerMemento.getMemento(0));
		System.out.println(meciJucat.toString());
		meciJucat.setMemento(managerMemento.getLasMemento());
		System.out.println(meciJucat.toString());
		
		
	}

}
