package fr.gtm.fregate;

public class LeChocolatCestLaVie {
	private double poids;
	
	public LeChocolatCestLaVie() {
		init();
	}
	
	public void init(){
		this.poids = 40.0;
	}
	
	public void manger(int carreaux){
		this.poids += carreaux/10;
	}
	
	public void vomir(){
		this.poids -= 1;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}
	
}
