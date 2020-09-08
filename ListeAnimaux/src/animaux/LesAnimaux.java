package animaux;

import java.util.ArrayList;
import java.util.List;

public class LesAnimaux {

	private List<Animal> lesAnimaux;
	
	public LesAnimaux(){
		lesAnimaux  = new ArrayList<Animal>();
	}
	
	public String affPattes(int nbPattes){
		String str = "";
		
		//Expressions lambda en C#
//		lesAnimaux
//		      .OfType<AnimalAvecPatte>()
//		      .Where(x => x.getNbPattes() == nbPattes)
//		      .Select(x => x.toString() + "\n")
//		      .Join();
		
		
		for (Animal animal : lesAnimaux) {
			if(animal instanceof AnimalAvecPatte){
				AnimalAvecPatte a = (AnimalAvecPatte) animal;
				if(a.getNbPattes() == nbPattes){
					str = a.toString() + "\n";
				}
			}
		}
		
		return str;
	}
	
	public void ajouter(Animal animal){
		this.lesAnimaux.add(animal);
	}
	
	public String cacophonie(){
		String str = "";
		for (Animal animal : lesAnimaux) {
			str = str + animal.crier() + "\n";
		}
		return str;
	}

	@Override
	public String toString() {
		String str = "";
		for (Animal animal : lesAnimaux) {
			str = str + animal.toString() + "\n";
		}
		return str;
	}
	
	
}
