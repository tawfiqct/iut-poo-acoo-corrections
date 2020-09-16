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
		String str = String.format("%s - Ah ah ! %s , tu es mienne desormais !", this.getNom(), dame.getNom());
		System.out.println(str);
		this.dames.add(dame);
		dame.kidnapper();
		System.out.println();
	}
	public void emprisonner(Cowboy cowboy){
		
		//Damned, je suis fait !
		//(nom du cowboy) , tu m’as eu !
		this.enPrison = true;
		System.out.println(this.getNom() + " - Damned, je suis fait !");
		System.out.println(this.getNom() + " - " + cowboy.getNom() + "Damned, tu m’as eu !");
	}
	
	public int montantCapture(){
		return this.recompense;
	}
	@Override
	public void quelEstTonNom() {
		//(son nom) le (son look)
		System.out.println(this.getNom() + " - " + this.getNom() + " le " + this.look);
	}
	@Override
	public void sePresenter() {

		String str = String.format("%s - Bonjour, je suis %s le %s et j’aime le %s.", this.getNom(), this.getNom(), this.look, this.getBoisson());
		System.out.println(str);
		super.sePresenter();
		str = String.format("%s - J’ai l’air %s et j’ai déjà kidnappé %d dames !", this.getNom(), this.look, this.dames.size());
		System.out.println(str);
		str = String.format("%s - Ma tête est mise à prix %d $ !",this.getNom(), this.recompense);
		System.out.println(str);
	}
	
	
}
