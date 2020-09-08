package animaux;

public abstract class AnimalSansPatte extends Animal{
	


	private double longueur;


	
	public double getLongueur() {
		return longueur;
	}

	public AnimalSansPatte(String race, double poids, double longueur) {
		super(race, poids);
		this.longueur = longueur;
	}

	@Override
	public String toString() {
		return this.race + ", " + this.poids + " Kg, " + this.longueur + " cm";
	}

}
