package fichiers;

public class Principale {
	public static void main(String[] args) {
		Dossier racine = new Dossier("/");
		Dossier home = new Dossier("home", racine);
		Dossier bin = new Dossier("bin", racine);
		Dossier etu1 = new Dossier("etu1", home);
		Dossier etu2 = new Dossier("etu2");
		home.ajouterElement(etu2);
		Fichier rien = new Fichier("rien.txt", 100);
		Fichier trombi = new Fichier("trombi.doc", 2400);
		home.ajouterElement(rien);
		home.ajouterElement(trombi);
		Fichier notes1 = new Fichier("notes.odt", 500);
		etu1.ajouterElement(notes1);
		Fichier notes2 = new Fichier("notes.odt", 400);

		etu2.ajouterElement(notes2);
		Fichier essai = new Fichier("essai.sh", 80);
		bin.ajouterElement(essai);
		home.afficheContenu();
		System.out.println();
		home.afficheTaille();
		System.out.println();
		home.afficheFichier(500);
	}
}
