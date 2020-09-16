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
	
	public int getPopularite(){
		return this.popularite;
	}
	
	public String getAdjectif(){
		return this.adjectif;
	}
	
	public void tirer(HorsLaLoi horsLaLoi){
		//Le (adjectif) (nom) tire sur
		//(nom du méchant) . PAN ! 
		//"Prend ça, rascal ! "
		String txt = String.format("Le %s %s tire sur %s . PAN !", this.adjectif, this.getNom(), horsLaLoi.getNom());

		System.out.println(txt);
		 txt = String.format("Prend ça, rascal !", this.getNom());
		parler(txt);
	}
	
	public void liberer(Dame dame){
		
	}
	
	@Override
	public void sePresenter() {
		String txt = String.format("Bonjour, je suis %s, ont dit que je suis %s, je suis %d populaire.",this.getNom(), this.adjectif, this.popularite);
		parler(txt);
	}
}
