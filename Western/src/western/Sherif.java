package western;

import java.util.ArrayList;

public class Sherif extends Cowboy{


//	On ajoute � notre histoire des sh�rifs. Un sh�rif est un cowboy qui peut coffrer des brigands
//	(en criant " Au nom de la loi, je vous arr�te ! ". Il peut �galement rechercher un
//	brigand. Un commentaire indique alors qu�il placarde une affiche dans toute la ville, et il dit,
//	par exemple, " OYEZ OYEZ BRAVE GENS !! 200 $ � qui arr�tera Bob le brigand
//	mort ou vif !! ". Tout le monde s�accorde pour dire que les sh�rifs sont honn�tes. Il est
//	caract�ris� par le nombre de brigands qu�il a coffr� qu�il ne manquera pas de pr�ciser
//	lorsqu�il se pr�sente. Il refuse de se faire appeler autrement que par Sh�rif (son nom). 
	
	ArrayList<Brigand> brigands;
	
	public Sherif(String nom) {
		super(nom, "eau", "honn�te");
		this.brigands = new ArrayList<Brigand>();
	}
	
	public Sherif(String nom, String boisson) {
		super(nom, boisson, "honn�te");
		this.brigands = new ArrayList<Brigand>();
		// TODO Auto-generated constructor stub
	}
	
	public void coffrer(Brigand brigand){
		String str = String.format("%s - Au nom de la loi, je vous arr�te !", this.getNom());
		brigand.emprisonner(this);
		this.brigands.add(brigand);
		System.out.println(str);
	}
	
	public void rechercheBrigand(Brigand brigand){
		String str = String.format("%s placarde une affiche dans toute la ville.", this.getNom());
		
		str = String.format("OYEZ OYEZ BRAVE GENS !! %d $ � qui arr�tera %s le brigand mort ou vif !!", brigand.montantCapture(), brigand.getNom());
		this.parler(str);
	}

	@Override
	public void sePresenter() {
	
		String txt = String.format("Bonjour, je suis %s, ont dit que je suis %s, je suis %d populaire et j'ai captur� %d brigands !",this.getNom(), this.getAdjectif(), this.getPopularite() , this.brigands.size());
		this.parler(txt);
	}
	
	
}
