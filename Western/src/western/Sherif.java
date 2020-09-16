package western;

import java.util.ArrayList;

public class Sherif extends Cowboy{


//	On ajoute à notre histoire des shérifs. Un shérif est un cowboy qui peut coffrer des brigands
//	(en criant " Au nom de la loi, je vous arrête ! ". Il peut également rechercher un
//	brigand. Un commentaire indique alors qu’il placarde une affiche dans toute la ville, et il dit,
//	par exemple, " OYEZ OYEZ BRAVE GENS !! 200 $ à qui arrêtera Bob le brigand
//	mort ou vif !! ". Tout le monde s’accorde pour dire que les shérifs sont honnêtes. Il est
//	caractérisé par le nombre de brigands qu’il a coffré qu’il ne manquera pas de préciser
//	lorsqu’il se présente. Il refuse de se faire appeler autrement que par Shérif (son nom). 
	
	ArrayList<Brigand> brigands;
	
	public Sherif(String nom) {
		super(nom, "eau", "honnête");
		this.brigands = new ArrayList<Brigand>();
	}
	
	public Sherif(String nom, String boisson) {
		super(nom, boisson, "honnête");
		this.brigands = new ArrayList<Brigand>();
		// TODO Auto-generated constructor stub
	}
	
	public void coffrer(Brigand brigand){
		String str = String.format("%s - Au nom de la loi, je vous arrête !", this.getNom());
		brigand.emprisonner(this);
		this.brigands.add(brigand);
		System.out.println(str);
	}
	
	public void rechercheBrigand(Brigand brigand){
		String str = String.format("%s placarde une affiche dans toute la ville.", this.getNom());
		
		str = String.format("OYEZ OYEZ BRAVE GENS !! %d $ à qui arrêtera %s le brigand mort ou vif !!", brigand.montantCapture(), brigand.getNom());
		this.parler(str);
	}

	@Override
	public void sePresenter() {
	
		String txt = String.format("Bonjour, je suis %s, ont dit que je suis %s, je suis %d populaire et j'ai capturé %d brigands !",this.getNom(), this.getAdjectif(), this.getPopularite() , this.brigands.size());
		this.parler(txt);
	}
	
	
}
