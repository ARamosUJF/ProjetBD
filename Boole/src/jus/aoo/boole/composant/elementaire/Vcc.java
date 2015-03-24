package jus.aoo.boole.composant.elementaire;

public class Vcc extends Generateur{
	public Vcc(int id){
		nomType="Vcc";
		nbSorties=1;
		assigneid(id);
		tabS = new int[nbSorties+1];
		tabS[1]=1;
		valeur = tabS[1];
		afficheValeur();
	}
}
