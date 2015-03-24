package jus.aoo.boole.composant.elementaire;

public class Itr extends Generateur{
	public Itr(int id){
		nomType="Itr";
		nbSorties=1;
		assigneid(id);
		afficheValeur();
	}
	public void setValeur(int uneValeur){
		valeur=uneValeur;
	}
}
