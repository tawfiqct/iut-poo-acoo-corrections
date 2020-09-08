package fairedubruit;

import java.util.ArrayList;

public class Main {

	public static void main(String[] argv){
		Chien chien = new Chien("Chien");
		Chat chat = new Chat("Chat");
		Voiture v = new Voiture();
		
		ArrayList<Animal> animaux = new ArrayList<Animal>();
		animaux.add(chien);
		animaux.add(chat);
		
		for (Animal animal : animaux) {
			animal.getNom();
			if(animal instanceof Chat){
				Chat cat = (Chat)animal;
				cat.Ronronner();
			}else if(animal instanceof Chien){
				Chien dog = (Chien)animal;
				dog.ChercherUneBalle();
			}
		}
		
		
		ArrayList<FaireDuBruit> choses = new ArrayList<FaireDuBruit>();
		
		choses.add(chien);
		choses.add(chat);
		choses.add(v);
		
		for (FaireDuBruit c : choses) {
		
			
			Class<?> cls = c.getClass();
			do{
				
				Class<?> parent = cls.getSuperclass();
				System.out.println(parent.getName());
				cls = parent;
			}while(cls.getSuperclass() != null);
			
			System.out.println(c.faireDuBruit());
		}
		
	
	}
}
