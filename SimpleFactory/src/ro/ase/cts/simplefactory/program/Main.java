package ro.ase.cts.simplefactory.program;

import ro.ase.cts.simplefactory.Factory;
import ro.ase.cts.simplefactory.Jucator;
import ro.ase.cts.simplefactory.TipJucator;

public class Main {
   public static void main(String[] args) {
	 Factory factory=new Factory();
	 Jucator portar=factory.getJucator(TipJucator.Portar, "Dorel");
	 Jucator fundas=factory.getJucator(TipJucator.Fundas, "Ionel");
	 
	 System.out.println(portar.toString());
	 System.out.println(fundas.toString());
 }
}
