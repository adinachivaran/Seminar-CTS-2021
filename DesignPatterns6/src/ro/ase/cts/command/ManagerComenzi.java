package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	List<IComanda> listaComenzi;
	
	public ManagerComenzi() {
		listaComenzi=new ArrayList<IComanda>();
	}
	
	public void invoca(IComanda comanda) {
		listaComenzi.add(comanda);
	}
	
	public void executaComanda() throws Exception {
		if(listaComenzi.size()>0) {
		listaComenzi.get(0).executa();
		listaComenzi.remove(0);
		}
		else {
			throw new Exception();
		}
	}
	
	public void executaComenzi() {
			for(IComanda c: listaComenzi) {
				c.executa();
			}
			listaComenzi.clear();
	}
}
