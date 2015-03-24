package jus.aoo.boole.port;

import jus.aoo.boole.composant.Composant;

public class Port {
		Composant c1,c2;
		int portE,portS;
		
	public Port(Composant n1, Composant n2,int pS, int pE){
		c1 = n1;
		c2 = n2;
		portE = pE;
		portS = pS;
	}
	public void connexion() {
		int valeur = c1.valeurS(portS);
		c2.assigneValeur(portE,valeur); 
	}
}
