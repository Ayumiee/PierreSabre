package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		Humain Prof = new Humain("Prof","kombucha",54);
		Prof.direBonjour();
		Prof.acheter("boisson", 12);
		Prof.boire();
		Prof.acheter("jeu", 2);
		Prof.acheter("kimono", 50);
		
		Commercant Marco = new Commercant("Marco",20);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoir(15);
		Marco.boire();
		
		Yakuza Yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
		Yaku.direBonjour();
		Yaku.extorquer(Marco);
		
		Ronin Roro = new Ronin("Roro","shochu",60);
		Roro.donner(Marco);
		
	}
	

}


