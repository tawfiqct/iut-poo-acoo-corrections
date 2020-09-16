package western;

public class Cowboy extends Humain{
	private int popularite;
	private String adjectif ="vaillant";
	
	public Cowboy(String nom) {
		super(nom);
	}
	public Cowboy(String nom, String boisson) {
		super(nom, boisson);
	}
	public Cowboy(String nom, String boisson, String adjectif) {
		super(nom, boisson);
		this.adjectif = adjectif;
	}
	
	public void tirer(Brigand brigand){
		//Le (adjectif) (nom) tire sur
		//(nom du méchant) . PAN ! 
		//"Prend ça, rascal ! "
		String txt = String.format("Le %s %s tire sur %s . PAN !", this.adjectif, this.getNom(), brigand.getNom());

		System.out.println(txt);
		 txt = String.format("%s - Prend ça, rascal !", this.getNom());
		System.out.println(txt);
	}
	
	public void liberer(Dame dame){
		
	}
	
	@Override
	public void sePresenter() {
		String txt = String.format("%s - Bonjour, je suis %s, ont dit que je suis %s, je suis %d populaire.",this.getNom(), this.getNom(), this.adjectif, this.popularite);
		System.out.println(txt);
	}
}
