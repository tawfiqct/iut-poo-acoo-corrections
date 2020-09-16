package western;

import java.util.ArrayList;

public class Ripoux extends Sherif implements HorsLaLoi{

	
	private int recompense;
	private boolean enPrison = false;
	private ArrayList<Dame> dames;
	
	public Ripoux(String nom, int recompense) {
		super(nom);
		this.recompense = recompense;
	}

	@Override
	public void kidnapper(Dame dame) {
		//Ah ah ! ( nom de la dame) , tu es mienne desormais !
		String str = String.format("Ah ah ! %s , tu es mienne desormais !", dame.getNom());
		parler(str);
		this.dames.add(dame);
		dame.kidnapper();
	}

	@Override
	public void emprisonner(Cowboy cowboy) {
		//Damned, je suis fait !
		//(nom du cowboy) , tu m’as eu !
		this.enPrison = true;
		parler("Damned, je suis fait !");
		parler(cowboy.getNom() + ", tu m’as eu !");
	}

	@Override
	public int montantCapture() {
		return this.recompense;
	}

}
