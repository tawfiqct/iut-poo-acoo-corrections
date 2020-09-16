package western;

import java.util.ArrayList;

public class Brigand extends Humain{
	private ArrayList<Dame> dames;
	private String look = "méchant";
	private int recompense = 100;
	private boolean enPrison = false;
	
	public Brigand(String nom) {
		super(nom);
		this.dames = new ArrayList<Dame>();

	}
	public Brigand(String nom, String boisson) {
		super(nom, boisson);
		this.dames = new ArrayList<Dame>();


	}
	public Brigand(String nom, String boisson, String look, int recompense) {
		super(nom, boisson);
		this.dames = new ArrayList<Dame>();
		this.look = look;
		this.recompense = recompense;
	}
	
	public void kidnapper(Dame dame){
		//Ah ah ! ( nom de la dame) , tu es mienne desormais !
		String str = String.format("Ah ah ! %s , tu es mienne desormais !", dame.getNom());
		System.out.println(str);
		this.dames.add(dame);
		dame.kidnapper();
		System.out.println();
	}
	public void emprisonner(Cowboy cowboy){
		
		//Damned, je suis fait !
		//(nom du cowboy) , tu m’as eu !
		this.enPrison = true;
		System.out.println("Damned, je suis fait !");
		System.out.println(cowboy.getNom() + "Damned, tu m’as eu !");
	}
	
	public int montantCapture(){
		return this.recompense;
	}
	@Override
	public void quelEstTonNom() {
		//(son nom) le (son look)
		System.out.println(this.getNom() + " le " + this.look);
	}
	
	
}
