package animaux;

import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
		LesAnimaux  animaux = new LesAnimaux();
		
		Chien leChien = new Chien("Labrador", 40, 1);
		//leChien.setNbPattes(3);
		
		animaux.ajouter(leChien);

		Serpent serpent = new Serpent("Serpent à sonnette", 5, 300, true);

		Canard mulard = new Canard("Mulard", 4);

		animaux.ajouter(serpent);
		animaux.ajouter(mulard);
		
		System.out.println("Tous les animaux :");
		System.out.println(animaux);	
		
		System.out.println();
		System.out.println("Les cris des animaux :");
		System.out.println(animaux.cacophonie());
		
		System.out.println();
		System.out.println("Les animaux à 4 pattes :");
		System.out.println(animaux.affPattes(4));
		
	}

}
