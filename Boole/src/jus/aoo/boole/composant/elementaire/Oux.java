package jus.aoo.boole.composant.elementaire;

public class Oux extends Transformateur{
	int j=0;
	public Oux(){
		nomType="Oux";
		nbSorties=1;
		identifiantComposant();
	}
	@Override
	public void calcul() {
		if (tabE[0]==0 && tabE[1]==1 || tabE[0]==1 && tabE[1]==0){
			tabS[0]=1;
		}else{
			tabS[0]=0;
		}
	}
}
