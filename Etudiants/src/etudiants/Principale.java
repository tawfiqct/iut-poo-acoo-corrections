package etudiants;

public class Principale {

	public static void main(String[] args) {
		Etudiant etu1 = new Etudiant("AA", "Arthur");
		EtudiantSportif etu2 = new EtudiantSportif("CC", "Christophe", "Karaté");
		Etudiant lesEtudiants[] = new Etudiant[2];
		lesEtudiants[0] = etu1;
		lesEtudiants[1] = etu2;
		for (int i = 0; i < lesEtudiants.length; i++) {
			System.out.println(lesEtudiants[i]);
		}
	}
}
