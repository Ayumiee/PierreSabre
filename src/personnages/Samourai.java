package personnages;

import java.util.Random;

public class Samourai extends Ronin {
	private String seigneur ;
	
	public Samourai(String nom, String boisson, int argent, String seigneur) {
		super(nom,boisson,argent);
		this.seigneur=seigneur;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier(e) de servir le seigneur "+seigneur);
	}
	
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson? Tien je vais prendre du "+ boisson);
	}
}
