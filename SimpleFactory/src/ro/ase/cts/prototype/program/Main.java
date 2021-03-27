package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.Client;

public class Main {

	public static void main(String[] args) {
		Client client1=new Client("Marcel",23);
		Client client2=(Client)client1.copiaza();
		
		System.out.println(client1);
		System.out.println(client2);

	}

}
