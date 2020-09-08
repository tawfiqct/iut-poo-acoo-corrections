package fichiers;

import java.util.ArrayList;

public class Dossier extends Element{

	private Dossier parent;
	private ArrayList<Element> elements;

	public Dossier(String nom){
		super(nom);
		this.elements = new ArrayList<Element>();
	}
	
	public Dossier(String nom, Dossier parent){
		super(nom);
		this.parent = parent;
		this.elements = new ArrayList<Element>();
		parent.elements.add(this);
	}
	
	public void ajouterElement(Element e){
		elements.add(e);
		if(e instanceof Dossier){
			((Dossier) e).parent = this;
		}
	}
	
	public void afficheContenu(){
//			    Contenu du dossier 'home' (dossier parent '/') :
//				(R)-etu1
//				(R)-etu2
//				(F)-rien.txt
//				(F)-trombi.doc
		
		System.out.println(String.format("Contenu du dossier %s (dossier parent '%s'", this.getNom(), this.parent.getNom()));
		for (Element element : elements) {
			
			System.out.print((element instanceof Dossier) ? "(R)" : "(F)");
			System.out.println(" - "+ element.getNom());
		}
	}
	
	public void afficheTaille(){
//		Taille du dossier 'home' : 3400
		System.out.print("Taille du dossier '"+this.getNom()+"' : ");
		System.out.println(calculeTaille(this));
	}
	
	private int calculeTaille(Element e){
		int taille = 0;
		if(e instanceof Fichier){
			return ((Fichier) e).getTaille();
		}else{
			for (Element element : ((Dossier)e).elements) {
				taille += calculeTaille(element);
			}
		}
		return taille;
	}
	
	
	public void afficheFichier(int taille){
//		Fichier(s) dont la taille est sup. a 500 :
//		(F)-trombi.doc – 2400
	}
}
