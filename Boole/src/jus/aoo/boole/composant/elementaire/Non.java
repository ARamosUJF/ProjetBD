package jus.aoo.boole.composant.elementaire;

public class Non extends Transformateur{
	int j=0;
	public Non(){
		nomType="Non";
		nbSorties=1;
		nbEntrees=1;
		identifiantComposant();
	}
	@Override
	public void calcul() {
		if(tabE[0]==1){
			tabS[0]=0;
		}else{
			tabS[0]=1;
		}
	}
}
