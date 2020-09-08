package animaux;

public class Chien extends AnimalAvecPatte{

	private int categorie;

	public int getCategorie() {
		return categorie;
	}
	
	public Chien(String race, double poids, int categorie) {
		super(race, poids, 4);
		this.categorie = categorie;
	}

	@Override
	//race, poids en kg, nb de pattes, cat�gorie 
	public String toString() {
		return this.race + ", " + this.poids + " kg, "+ this.getNbPattes() +" pattes, cat�gorie " + this.categorie;
	}

	@Override
	public String crier() {
		
		return "ouaf ouaf";
	}
}
