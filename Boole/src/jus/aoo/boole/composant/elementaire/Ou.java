package jus.aoo.boole.composant.elementaire;

public class Ou extends Transformateur{
	boolean un = false;
	int j=0;
	public Ou(int id){
		nomType="Ou";
		nbSorties=1;
		assigneid(id);
	}
	@Override
	public void calcul() {
		for(int i=1; i<tabE.length; i++){
			if (tabE[i]==1){
				un = true;
			}
		}
		if(un){
			tabS[1]=1;
		}else{
			tabS[1]=0;
		}
	}
}
