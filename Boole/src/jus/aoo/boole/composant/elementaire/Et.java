package jus.aoo.boole.composant.elementaire;

public class Et extends Transformateur{
	boolean zero = false;
	int j=0;
	public Et(){
		nomType="Et";
		nbSorties=1;
		identifiantComposant();
	}

	@Override
	public void calcul() {
		for(int i=0; i<nbEntrees; i++){
			if (tabE[i]==0){
				zero = true;
			}
		}
		if(zero){
			tabS[0]=0;
		}else{
			tabS[0]=1;
		}
	}
}
