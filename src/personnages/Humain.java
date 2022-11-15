package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
	int nbConnaissance=0;
	private Humain[] memoire = new Humain[30];
		
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
		
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("("+getNom()+") <"+ texte +">");
	}
		
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ getNom()+" et j'aime boire du "+ boisson);
	}
		
	public void boire() {
		parler("Mmmm, un bon verre de "+ boisson + "! GLOUPS !");
	}
	
	public void acheter(String bien,int prix){
		if (getArgent()>=prix){
			parler("J'ai "+getArgent()+" sous en poche. Je vais pouvoir m'offrir un "+bien+" à "+prix+" sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai que "+getArgent()+" sous en poche. Je ne peux même pas m'offrir un "+bien+" à "+prix+" sous.");
		}
		
	}
	
	public void gagnerArgent(int gain) {
		argent=getArgent()+gain;
	}
	
	public void perdreArgent(int perte) {
		argent=getArgent()-perte;
	}

	public void repondre(Humain humain) {
		direBonjour();
	}
	
	public void memoriser(Humain humain) {
		int i;
		if (nbConnaissance<30){
			memoire[nbConnaissance]=humain;
			nbConnaissance++;
		}
		else {
			for (i=0;i<29;i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[29]=humain;
		}
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
		autreHumain.memoriser(this);
	}
	
	public void listerConnaissance() {
		int i;
		if (nbConnaissance > 0) {
			parler("Je connais beaucoup de monde dont:");
			for (i=0;i<nbConnaissance;i++) {
				if (i==nbConnaissance-1) {
					System.out.println(memoire[i].getNom());
				}
				else {
					System.out.println(memoire[i].getNom()+",");
				}
				
			
			}
			
		}
	}
}

