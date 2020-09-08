package animaux;

public abstract class AnimalAvecPatte extends Animal{
	

	private int nbPattes;

	public int getNbPattes() {
		return nbPattes;
	}

	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}
	
	public AnimalAvecPatte(String race, double poids, int nbPattes) {
		super(race, poids);
		this.nbPattes = nbPattes;
	}

	
	@Override
	public String toString() {
		return this.race + ", " + this.poids + " kg, " + this.nbPattes + " pattes";
	}

}
