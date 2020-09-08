package cartes;

enum Couleur {
	Trefle, Carreau, Coeur, Pique
}

public class Carte {
	Couleur couleur;
	int Valeur;

	public Couleur getCouleur() {
		return couleur;
	}

	public int getValeur() {
		return Valeur;
	}

	public Carte(int valeur, Couleur couleur) {
		this.couleur = couleur;
		Valeur = valeur;
	}

	@Override
	public String toString() {
		return Afficher();
	}

	public String toStringLong() {
		return AfficherLong();
	}

	public String Afficher() {
		String c = "";

		switch (this.couleur) {
		case Trefle:
			c = "T";
			break;
		case Carreau:
			c = "K";
			break;
		case Coeur:
			c = "C";
			break;
		case Pique:
			c = "P";
			break;
		}

		String v = "";
		switch (this.Valeur) {
		case 11:
			v = "V";
			break;
		case 12:
			v = "D";
			break;
		case 13:
			v = "R";
			break;
		}

		return v + c;
	}

	public String AfficherLong() {
		String c = "";
		switch (this.couleur) {
		case Trefle:
			c = "Trèfle";
			break;
		case Carreau:
			c = "Carreau";
			break;
		case Coeur:
			c = "Coeur";
			break;
		case Pique:
			c = "Pique";
			break;
		}

		String v = "";
		switch (this.Valeur) {
		case 1:
			v = "As";
			break;
		case 11:
			v = "Valet";
			break;
		case 12:
			v = "Dame";
			break;
		case 13:
			v = "Roi";
			break;
		default:
			v = String.valueOf(this.Valeur);
			break;
		}

		return v + " de " + c;
	}

	public int compareTo(Carte c) {

		int difference;
		if (c.Valeur > this.Valeur || c.Valeur < this.Valeur)
			difference = this.Valeur - c.Valeur;
		else {
			difference = this.couleur.compareTo(c.couleur);
		}
		return difference;
	}
}
