package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
		
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
			parler("J'ai "+getArgent()+" sous en poche. Je vais pouvoir m'offrir un "+bien+" � "+prix+" sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai que "+getArgent()+" sous en poche. Je ne peux m�me pas m'offrir un "+bien+" � "+prix+" sous.");
		}
		
	}
	
	public void gagnerArgent(int gain) {
		argent=getArgent()+gain;
	}
	
	public void perdreArgent(int perte) {
		argent=getArgent()-perte;
	}
}

