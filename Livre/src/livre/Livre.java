package livre;

public class Livre {
	private String auteur;
	private String editeur;
	private int nbPages;
	private int numero;
	private String titre;
	private static final String EDITEUR_DEFAUT = "Galimard";
	private static int numLivre = 1;
	
	
	
	public Livre(String auteur, String titre) {
		super();
		this.numero = numLivre;
		numLivre++;
		this.auteur = auteur;
		this.titre = titre;
		this.editeur = EDITEUR_DEFAUT;
	}

	
	public Livre(String auteur, String editeur, String titre, int nbPages) {
		super();
		this.numero = numLivre;
		numLivre++;
		this.auteur = auteur;
		this.editeur = editeur;
		this.nbPages = nbPages;
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	
	@Override
	public String toString() {
		String str = String.format("Numero : %d | Titre : %s | Editeur : %s | Auteur : %s | NbPages : %d | ",
				this.numero, this.titre, this.editeur, this.auteur, this.nbPages);
		return str;
	}

	
	
	
	
}
