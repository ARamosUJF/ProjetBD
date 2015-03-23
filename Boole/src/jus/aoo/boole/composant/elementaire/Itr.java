package jus.aoo.boole.composant.elementaire;

public class Itr extends Generateur{
	public Itr(){
		nomType="Itr";
		nbSorties=1;
		identifiantComposant();
		afficheValeur();
	}
	public void setValeur(int uneValeur){
		valeur=uneValeur;
	}
}
