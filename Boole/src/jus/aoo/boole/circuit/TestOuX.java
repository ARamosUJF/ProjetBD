package jus.aoo.boole.circuit;

import jus.aoo.boole.composant.elementaire.*;
import jus.aoo.boole.port.Port;

public class TestOuX extends Circuit{
	Generateur generateur1, generateur2;
	Transformateur transfo1;
	Recepteur led;
	Port p1,p2;
	
	
	public TestOuX(){
		nbComposants = 4;
		tabIdComposant = new int[nbComposants+1];
		for(int i= 1; i <=nbComposants ; i++){ tabIdComposant[i] = i; }
		generateur1 = new Gnd(1);
		generateur2 = new Vcc(2);
		transfo1 = new Oux(3);
		led = new Led(4);	
	}
	
	public void tester(){
		p1 =  new Port(generateur1,transfo1,1,1);
		p2 =  new Port(generateur2,transfo1,1,2);
		p1.connexion();
		p2.connexion();
		transfo1.calcul();
		Port p3 =  new Port(transfo1,led,1,1);
		p3.connexion();
		System.out.println(led.afficherEtat());
	}
	
	
	
	
}
