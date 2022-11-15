package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		
	}
	
	public void donner(Commercant beneficiaire) {
		int don=argent*10/100;
		parler(beneficiaire.getNom()+" prend ces "+don+" sous.");
		beneficiaire.recevoir(don);
	}

	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		int force=honneur*2;
		if (force >= (adversaire.getRep())) {
			gagnerArgent(adversaire.perdre());
			honneur++;
			parler("Je t'ai eu petit yakusa!");
		}
		else {
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup");
			perdreArgent(argent);
			adversaire.gagner(argent);
		}
	}
	
}
