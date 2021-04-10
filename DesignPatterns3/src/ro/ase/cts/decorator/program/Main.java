package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.Decorator;
import ro.ase.cts.decorator.DecoratorContactLessTelefon;

public class Main {

	public static void main(String[] args) {
		Card card1=new Card("Ion",3000);
		card1.realizeazaPlataNormala(200);
		card1.realizeazaPlataOnline(300);
		
		Decorator cardNou=new Decorator(card1);
		cardNou.platesteContactLess(400);
		cardNou.realizeazaPlataNormala(200);
		cardNou.realizeazaPlataOnline(100);
		
		DecoratorContactLessTelefon decoratorContactlessTelefon=new DecoratorContactLessTelefon(card1);
		decoratorContactlessTelefon.realizeazaPlataNormala(200);
		decoratorContactlessTelefon.realizeazaPlataOnline(100);
		decoratorContactlessTelefon.platesteContactLess(100);
		
	}

}
