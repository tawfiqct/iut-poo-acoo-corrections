package cartes;

import java.util.ArrayList;

public class DeckComplet extends Deck {
	
	public DeckComplet() {
		super(52);
		for (Couleur couleur : Couleur.values()) {
			for (int i = 0; i < 13; i++) {
				Carte carte = new Carte(i + 1, couleur);
				deck.add(carte);
			}
		}
	}
}

