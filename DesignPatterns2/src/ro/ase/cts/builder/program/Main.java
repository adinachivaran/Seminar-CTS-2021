package ro.ase.cts.builder.program;

import ro.ase.cts.builder.BuilderRezervare;
import ro.ase.cts.builder.BuilderRezervare2;
import ro.ase.cts.builder.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1=new Rezervare(123,false,false,false,true,"Rock");
		Rezervare rezervare2=new BuilderRezervare().setCodRezervare(10).setAreScaunEgonomic(true).build();
		Rezervare rezervare3=new BuilderRezervare(11).setAreBauturaInclusa(true).setAreMuzicaAmbientala(true).build();
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		System.out.println(rezervare3.toString());
		
		BuilderRezervare br=new BuilderRezervare();
		Rezervare r4=br.setCodRezervare(20).setAreBauturaInclusa(false).build();
		Rezervare r5=br.setCodRezervare(25).build();
		System.out.println(r4.toString());
		System.out.println(r5.toString());
		
		BuilderRezervare2 rezervareBuilder2=new BuilderRezervare2();
		rezervareBuilder2.setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunEgonomic(true);
		Rezervare r6=rezervareBuilder2.setCodRezervare(30).build();
		Rezervare r7=rezervareBuilder2.setCodRezervare(35).build();
		
		System.out.println(r6.toString());
		System.out.println(r7.toString());
		
	}

}
