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
		String txt = String.format("Le %s %s tire sur %s . PAN ! \nPrend ça, rascal ! ", this.adjectif, this.getNom(), brigand.getNom());
		System.out.println(txt);
	}
	
	public void liberer(Dame dame){
		
	}
}
