package jus.aoo.boole.composant.elementaire;

public class Et extends Transformateur{
	boolean zero = false;
	int j=0;
	public Et(int id){
		nomType="Et";
		nbSorties=1;
		assigneid(id);
	}

	@Override
	public void calcul() {
		for(int i=1; i<=nbEntrees; i++){
			if (tabE[i]==0){
				zero = true;
			}
		}
		if(zero){
			tabS[1]=0;
		}else{
			tabS[1]=1;
		}
	}
}
