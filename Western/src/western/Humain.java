package western;

public class Humain {
	private String nom;
	private String boisson;

	public Humain(String nom, String boisson) {
		this.nom = nom;
		this.boisson = boisson;
	}

	public void parler(String texte) {
		String txt = String.format("%s - %s", this.nom, texte);
		System.out.println(txt);
	}
	
	public void sePresenter(){
		String txt = String.format("Bonjour, je suis %s, %s est ma boisson favorite.", this.nom, this.boisson);
		System.out.println(txt);
	}
	
	public void boire(){
		//Ah ! un bon verre de (sa boisson favorite) !
		//GLOUPS !
		
		String txt = String.format("Ah ! un bon verre de %s !\nGLOUPS !", this.boisson);
		System.out.println(txt);
	}

	public String quelEstTonNom() {
		return this.nom;
	}

	public String quelEstTaBoisson() {
		return this.boisson;
	}
}
