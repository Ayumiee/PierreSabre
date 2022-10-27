package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int gain=victime.seFaireExtorquer();
		reputation++;
		argent=argent+gain;
		parler("J'ai piqué les "+gain+" sous de "+victime.getNom()+", ce qui me fait "+argent+" sous dans ma poche. Hi! hi!");
		
	}

	public int perdre(){
		int perte= argent;
		perdreArgent(argent);
		reputation--;
		parler("J'ai perdu mon duel et mes "+perte+" sous, snif.. J'ai déshonoré le clan de "+clan);
		return perte;
	}
	
	public int gagner(int gain) {
		int argentInit=argent;
		argent=argent+gain;
		reputation++;
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+ "? Je l'ai dépouillé de ses "+gain+"sous.");
		return argentInit;
		//a voir s'il faut renvoyer ça
	}
}
