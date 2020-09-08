package livre;

import java.util.ArrayList;

public class gestionLivres {

	public static void main(String[] args) {
		Livre l1 = new Livre("Pullman Philip", "Flamarion", "A la croisée des monde", 500);

		Livre l2 = new Livre("J.R.R Toliken", "Hachette", "Le Silmarilion", 250);

		Livre l3 = new Livre("Martin KK", "Games of Throne");

		ArrayList<Livre> livres = new ArrayList<Livre>();

		livres.add(l1);
		livres.add(l2);
		livres.add(l3);

		for (Livre livre : livres) {
			System.out.println(livre);
		}

		A a = new A(1);
		A a1 = a;
		
		if(a.equals(a1)){
			System.out.println("VRAI");
		}
		
		int i = Integer.parseInt("10");

	}
	

}
