package fichiers;

public class Fichier extends Element{
	private int taille;
	
	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public Fichier(String nom, int taille){
		super(nom);
		this.taille = taille;
	}
}
