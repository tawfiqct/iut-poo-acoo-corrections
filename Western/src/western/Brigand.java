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
		parler(str);
		this.dames.add(dame);
		dame.kidnapper();

	}
	public void emprisonner(Cowboy cowboy){
		
		//Damned, je suis fait !
		//(nom du cowboy) , tu m’as eu !
		this.enPrison = true;
		parler("Damned, je suis fait !");
		parler(cowboy.getNom() + "Damned, tu m’as eu !");
	}
	
	public int montantCapture(){
		return this.recompense;
	}
	
	
	@Override
	public String getNom() {
		
		return super.getNom() + " le " + this.look;
	}
	
	public void quelEstTonNom() {
		this.parler(this.getNom());
	}

	@Override
	public void sePresenter() {

		String str = String.format("Bonjour, je suis %s et j’aime le %s.", this.getNom(),  this.getBoisson());
		parler(str);
		super.sePresenter();
		str = String.format("J’ai l’air %s et j’ai déjà kidnappé %d dames !", this.look, this.dames.size());
		parler(str);
		str = String.format("Ma tête est mise à prix %d $ !",this.recompense);
		parler(str);
	}
	
	
}
