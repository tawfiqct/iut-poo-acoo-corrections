package animaux;

public class Canard extends AnimalAvecPatte{
	public Canard(String race, double poids){
		super(race, poids, 2);
	}	
	
	@Override
	public String crier() {
		
		return "coin coin";
	}
}
