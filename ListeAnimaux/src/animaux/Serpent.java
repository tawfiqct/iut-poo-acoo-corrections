package animaux;

public class Serpent extends AnimalSansPatte{

	private boolean venimeux;


	public Serpent(String race, double poids, double longueur, boolean venimeux) {
		super(race, poids, longueur);
		this.venimeux = venimeux;
	}
	

	@Override
	public String crier() {
		
		return "tsss tss";
	}
	
	@Override
	//race, poids en kg ,longueur en cm, venimeux ou non 
	public String toString() {
		return this.race + ", " +
				this.poids + " Kg, "+ 
				this.getLongueur() + " cm, " +
				(this.venimeux ? "" : "non") + "venimeux";
	}
}
