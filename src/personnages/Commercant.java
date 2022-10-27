package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);
		
	}

	public int seFaireExtorquer() {
		int argentPerdu=argent;
		perdreArgent(getArgent());
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return argentPerdu;
	}
	
	public void recevoir(int benefice) {
		gagnerArgent(benefice);
		parler(benefice+" sous ! Je te remercie g�n�reux donateur!");
	}
	
}
