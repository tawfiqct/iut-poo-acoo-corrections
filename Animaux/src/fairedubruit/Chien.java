package fairedubruit;

public class Chien extends Animal {

	public Chien(String nom) {
		super(nom);
	}
	
	public void ChercherUneBalle(){
		System.out.println("Bravoo !!!");
	}

	@Override
	public String faireDuBruit() {
		return "Ouaf ouaf";
	}
}
