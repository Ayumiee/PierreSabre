package personnages;

public class Traitre extends Samourai {
	int traitrise=0;

	public Traitre(String nom, String boisson, int argent, String seigneur, int traitrise) {
		super(nom, boisson, argent, seigneur);
		this.traitrise = 0;
		
	}

}
