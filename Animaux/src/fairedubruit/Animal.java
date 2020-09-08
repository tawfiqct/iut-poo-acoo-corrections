package fairedubruit;

public abstract class  Animal implements FaireDuBruit {
	private String nom;
	
	public static int nb = 0;
	
	public Animal(String nom){
		this.nom = nom;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public abstract String faireDuBruit();	
	
}
