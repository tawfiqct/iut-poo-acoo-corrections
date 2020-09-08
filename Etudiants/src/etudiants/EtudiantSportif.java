package etudiants;

public class EtudiantSportif extends Etudiant {
	private String sport;


	public EtudiantSportif(String leNom, String lePrenom, String leSport) {
		super(leNom, lePrenom);
		sport = leSport;
	}

	public String getSport() {
		return sport;
	}

	public void modification(String nvNom, String nvPrenom, String nvSport) {
		modification(nvNom, nvPrenom);
		sport = nvSport;
	}

	public String toString() {
		return super.toString() + "," + sport;
	}
}