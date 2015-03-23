package jus.aoo.boole.composant.elementaire;

public class Ou extends Transformateur{
	boolean un = false;
	int j=0;
	public Ou(){
		nomType="Ou";
		nbSorties=1;
		identifiantComposant();
	}
	@Override
	public void calcul() {
		for(int i=0; i<tabE.length; i++){
			if (tabE[i]==1){
				un = true;
			}
		}
		if(un){
			tabS[0]=1;
		}else{
			tabS[0]=0;
		}
	}
}
