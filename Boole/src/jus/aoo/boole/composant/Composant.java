package jus.aoo.boole.composant;

import jus.aoo.boole.circuit.Circuit;

public abstract class Composant extends Circuit {
	protected int numComposant = 0;
	protected String nomType;
	protected int nbEntrees;
	protected int nbSorties;
	protected int[] tabE ;
	protected int[] tabS ;

	public void calcul(){
		
	}

	public void assigneid(int id){
		numComposant = id;
	}

	public void setNbEntrees(int nb){
		nbEntrees=nb;
	}
	
	public int valeurS(int indice){
		return tabS[indice];
	}
	
	public void assigneValeur(int indice, int val){
		tabE[indice] = val;
	}
	
	
}
