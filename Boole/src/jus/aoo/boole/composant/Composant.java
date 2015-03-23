package jus.aoo.boole.composant;

import jus.aoo.boole.circuit.Circuit;

public abstract class Composant extends Circuit {
	protected int numComposant = 0;
	protected String nomType;
	protected int nbEntrees;
	protected int nbSorties;
	protected int[] tabE = new int[nbEntrees];
	protected int[] tabS = new int[nbSorties];

	public void calcul(){
		
	}
	
	public void identifiantComposant() {
		int j = 0;
		numComposant++;
		nomType = "Et";
		nbSorties = 1;
		while (j < tabIdComposant.length) {
			if (tabIdComposant[j] == numComposant) {
				numComposant++;
				j = 0;
			}
			j++;
		}
		for (int i = 0; j < tabIdComposant.length; i++) {
			if (tabIdComposant[i] != 0) {
				tabIdComposant[i] = numComposant;
			}
		}
	}
	
	public void setNbEntrees(int nb){
		nbEntrees=nb;
	}
}
