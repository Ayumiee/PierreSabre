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
		System.out.println("Je suis fier(e) de servir le seigneur "+seigneur);
	}
	
	@Override
	public void boire() {
		Random random = new Random();
		int numeroboisson=random.nextInt(0+3)+0;
		String[] boisson= new String["Thé","café"];
		#se renseigner comment creer un tab
	}
}
