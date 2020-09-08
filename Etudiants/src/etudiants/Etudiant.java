package etudiants;

public class Etudiant {
	private String nom;
	private String prenom;


	public Etudiant(String sonNom, String sonPrenom) {
		nom = sonNom;
		prenom = sonPrenom;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String toString() {
		return nom + "," + prenom;
	}

	public void modification(String nvNom, String nvPrenom) {
		nom = nvNom;
		prenom = nvPrenom;
	}

} 
