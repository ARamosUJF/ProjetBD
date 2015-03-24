package jus.aoo.boole.composant.elementaire;

import jus.aoo.boole.composant.Composant;

public class Recepteur extends Composant{
	protected String etat;
	public String afficherEtat(){
		if(tabE[1]==1){
			etat = "allume";
		}else{
			etat = "eteint";
		}
		return etat;
	}
}
