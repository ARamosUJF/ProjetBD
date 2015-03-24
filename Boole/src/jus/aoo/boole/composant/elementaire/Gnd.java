package jus.aoo.boole.composant.elementaire;

public class Gnd extends Generateur{
	public Gnd(int id){
		nomType="Gnd";
		nbSorties=1;
		assigneid(id);
		tabS = new int[nbSorties+1];
		tabS[1]=0;
		valeur = tabS[1];
		afficheValeur();
	}
}
