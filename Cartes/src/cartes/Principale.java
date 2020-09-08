package cartes;

public class Principale {

	public static void main(String[] args) {
		
		DeckComplet deck = new DeckComplet();
		deck.Melanger(100);
		
		Deck deckJ1 = new Deck(0);
		Deck deckJ2 = new Deck(0);

		for (int i = 0; i < 5; i++) {
			deckJ1.AJouter(deck.Piocher());
			deckJ2.AJouter(deck.Piocher());
		}
		
		deckJ1.OrdonnerValeur();
		deckJ2.OrdonnerValeur();
		deck.OrdonnerValeur();
		
		System.out.println("Joueur 1 : ");
		deckJ1.Afficher();
		System.out.println("\nJoueur 2 :");
		deckJ2.Afficher();
		
		System.out.println("\nPioche :");
		deck.Afficher();
		
		
		if(deckJ1.getPaire() != null){
			System.out.println("oui : une paire de " + deckJ1.getPaire().get(0).getValeur());
		}else{
			System.out.println("non");
		}
	}

}