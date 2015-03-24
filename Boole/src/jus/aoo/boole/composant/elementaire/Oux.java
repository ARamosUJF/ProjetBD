package jus.aoo.boole.composant.elementaire;

public class Oux extends Transformateur{
	int j=0;
	public Oux(int id){
		nomType="Oux";
		nbSorties=1;
		tabS = new int[nbSorties+1];
		nbEntrees = 2;
		tabE = new int[nbEntrees+1];
		assigneid(id);
	}
	@Override
	public void calcul() {
		if (tabE[1]==0 && tabE[2]==1 || tabE[1]==1 && tabE[2]==0){
			tabS[1]=1;
		}else{
			tabS[1]=0;
		}
	}
}
