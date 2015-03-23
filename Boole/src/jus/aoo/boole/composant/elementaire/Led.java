package jus.aoo.boole.composant.elementaire;

public class Led extends Recepteur{
	public Led(){
		nomType="Led";
		nbEntrees=1;
		identifiantComposant();
		if(tabE[0]==1){
			etat = "allumé";
		}else{
			etat = "éteint";
		}
		afficherEtat();
	}
}
