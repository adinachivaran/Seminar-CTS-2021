package ro.ase.cts.template.program;

import ro.ase.cts.template.MasaInBar;
import ro.ase.cts.template.OcupareMasa;
import ro.ase.cts.template.TemplateOcupareMasa;

public class Main {

	public static void main(String[] args) {
		TemplateOcupareMasa masa=new OcupareMasa(10);
		masa.ocupaMasa();
		TemplateOcupareMasa masa2=new MasaInBar(20);
		masa2.ocupaMasa();

	}

}
