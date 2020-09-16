package western;

public class Histoire {
	
	public static void main(String[] args) {
		Humain john = new Humain("John Smith", "eau");
		john.sePresenter();
		john.boire();
		
		Dame dame = new Dame("Hélène", "thé", "rose");
		Brigand brigand = new Brigand("Walter", "bière", "affreux", 200);
		Cowboy cowboy = new Cowboy("Philip", "lait", "superbe");
		
		dame.sePresenter();
		dame.quelEstTonNom();
		brigand.quelEstTonNom();
		brigand.kidnapper(dame);
		cowboy.tirer(brigand);
		
		dame.quelEstTonNom();
	}
}
