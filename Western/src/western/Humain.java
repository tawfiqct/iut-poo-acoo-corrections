package western;

public class Humain {
	private String nom;
	private String boisson;

	public Humain(String nom) {
		this.nom = nom;
		this.boisson = "eau";
	}
	
	public Humain(String nom, String boisson) {
		this.nom = nom;
		this.boisson = boisson;
	}

	public void parler(String texte) {
		String txt = String.format("%s - %s", this.nom, texte);
		System.out.println(txt);
	}
	
	public void sePresenter(){
		String txt = String.format("%s - Bonjour, je suis %s, %s est ma boisson favorite.",this.nom, this.nom, this.boisson);
		System.out.println(txt);
	}
	
	public void boire(){
		//Ah ! un bon verre de (sa boisson favorite) !
		//GLOUPS !
		
		String txt = String.format("%s - Ah ! un bon verre de %s !",this.nom,  this.boisson);
		System.out.println(txt);
		
		txt = String.format("%s - GLOUPS",this.nom);
		System.out.println(txt);
		
	}

	public String getNom(){
		return this.nom;
	}
	public String getBoisson(){
		return this.boisson;
	}
	public void quelEstTonNom() {
		System.out.println(this.getNom() + " - " + this.nom);
	}

	public String quelEstTaBoisson() {
		return this.boisson;
	}
}
