package ro.ase.cts.facade.program;

import ro.ase.cts.facade.BirouDeCredite;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.Politie;
import ro.ase.cts.facade.VerificatorPersoana;

public class Main {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("George","2960302456735");
        if(persoana.getVarsta()>=18) {
           if(!Politie.esteUrmarit(persoana)) {
        	   BirouDeCredite birou=new BirouDeCredite();
        	   if(!birou.areCredite(persoana)) {
        		   System.out.println("S-a creat contul");
        	   }
           }
        }
	
	Persoana persoana1=new Persoana("Maria","2950205451253");
	if(VerificatorPersoana.verificaPersoana(persoana1)) {
		System.out.println("in regula!");
	}
	else {
		System.out.println("ne pare rau!");
	}
			

}
}
