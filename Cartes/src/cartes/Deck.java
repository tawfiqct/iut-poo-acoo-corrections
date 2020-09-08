package cartes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {
	protected ArrayList<Carte> deck;

	public int getNbCartes() {
		return deck.size();
	}

	public Deck(int nbCartes) {
		deck = new ArrayList<Carte>();
	}

	public Carte Piocher() {
		Carte c = deck.remove(deck.size() - 1);
		return c;
	}

	public void AJouter(Carte carte) {
		this.deck.add(carte);
	}

	public Carte LireCarte(int i) {
		Carte c = null;
		if(i < deck.size() - 1){
			c = deck.get(i);
		}
		return c ;
	}

	public void Melanger(int nbIteration) {
		for (int i = 0; i < nbIteration; i++) {
			int n1 = (int) (Math.random() * deck.size());
			int n2 = (int) (Math.random() * deck.size());
			
			Carte temp = this.deck.get(n1);
			this.deck.set(n1, this.deck.get(n2));
			this.deck.set(n2, temp);
		}

	}
	
	public void MelangerShuffle(){
		Collections.shuffle(deck);
	}

	public void Afficher() {
		for (int i = 0; i < deck.size(); i++) {
			System.out.println(i + 1 + " - " + deck.get(i).AfficherLong());
		}
	}
	

	public void OrdonnerValeur() {
		// tri_à_bulles(Tableau T)
		// pour i allant de (taille de T)-1 à 1
		// pour j allant de 0 à i-1
		// si T[j+1] < T[j]
		// échanger(T[j+1], T[j])

		for (int i = deck.size() - 1; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (deck.get(j + 1).compareTo(deck.get(j)) < 0) {
					Carte temp = deck.get(j + 1);
					deck.set(j + 1, deck.get(j));
					deck.set(j, temp);
				}
			}
		}
	}
	

	public void OrdonnerCouleur() {
			
	}

	public void AfficherDansOrdre() {
		OrdonnerCouleur();
		Afficher();
	}

	private ArrayList<Carte> getMeilleurMemeValeur(int nbCartesMemeValeur) {
		ArrayList<Carte> carteMemeValeurs = null;
		int longueur = 1;
		int meilleurLongeur = 1;
		
		this.OrdonnerValeur();

		for (int i = 0; i < deck.size() - 1; i++) {
			if (deck.get(i).getValeur() == deck.get(i + 1).getValeur()) {
				longueur++;
			}
			if (longueur > meilleurLongeur)
				meilleurLongeur = longueur;

		}
		

		if (meilleurLongeur == nbCartesMemeValeur) {
			carteMemeValeurs = new ArrayList<Carte>();
			carteMemeValeurs.add(deck.get(0));
			for (int i = 1; i < deck.size(); i++) {
				if (carteMemeValeurs.get(0).getValeur() == deck.get(i).getValeur()) {
					carteMemeValeurs.add(deck.get(i));
				} else {
					if (carteMemeValeurs.size() < nbCartesMemeValeur) {
						carteMemeValeurs.clear();
						carteMemeValeurs.add(deck.get(i));
					}
				}
			}

		}

		return carteMemeValeurs;
	}

	
	public ArrayList<Carte> getCarre(){
		return this.getMeilleurMemeValeur(4);
	}
	
	public ArrayList<Carte> getBrelan(){
		ArrayList<Carte>  cartes = this.getCarre();
		if(cartes == null){
			cartes = this.getMeilleurMemeValeur(3);
		}else{
			cartes = null;
		}
		return cartes ;
	}
	
	public ArrayList<Carte> getDoublePaire(){
		return null;
	}
	
	public ArrayList<Carte> getPaire(){
		
		ArrayList<Carte>  cartes = this.getMeilleurMemeValeur(3);
		if(cartes == null){
			cartes = this.getMeilleurMemeValeur(2);
		}else{
			cartes = null;
		}
		return cartes ;
	}
}
