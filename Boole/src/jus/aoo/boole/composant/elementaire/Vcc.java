package jus.aoo.boole.composant.elementaire;

public class Vcc extends Generateur{
	public Vcc(){
		nomType="Vcc";
		nbSorties=1;
		identifiantComposant();
		tabS[0]=1;
		afficheValeur();
	}
}
