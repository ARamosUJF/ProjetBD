package jus.aoo.boole.composant.elementaire;

public class Led extends Recepteur{
	public Led(int id){
		nomType="Led";
		nbEntrees=1;
		tabE = new int[nbEntrees+1];
		assigneid(id);
	}
}
