package animaux;

public abstract class Animal {
	protected double poids;
	protected String race;
	
	public Animal(String race , double poids) {
		super();
		this.poids = poids;
		this.race = race;
	}

	public double getPoids() {
		return poids;
	}

	public String getRace() {
		return race;
	}

	public abstract String crier();
	
	@Override
	public String toString() {
		
		return this.race + ", " +  this.poids;
	}

	

}
