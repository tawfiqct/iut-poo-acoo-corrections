package western;

public class Dame extends Humain{


	private String couleurRobe;
	private boolean libre;
	
	public Dame(String nom) {
		super(nom);
		this.libre = true;
	}
	public Dame(String nom, String boisson) {
		super(nom, boisson);
		this.libre = true;
	}
	public Dame(String nom, String boisson, String couleurRobe) {
		super(nom, boisson);
		this.libre = true;
		this.couleurRobe = couleurRobe;
	}
	
	
	
	@Override
	public String getNom() {
		
		return "Miss " + super.getNom();
	}
	
	public void quelEstTonNom() {
		this.parler(this.getNom());
	}
	
	
	public void hurler(){
		parler("IIIIHHHHHHHHHHIIIHHHHHHHHH");
	}
	public void kidnapper(){
		this.hurler();
		this.libre = false;
	}

	public void liberer(){
		this.libre = true;
		parler("Merci !!!!");
	}
	
	public void changerRobe(String couleur){
		this.couleurRobe = couleur;
		parler("Regardez ma nouvelle robe "+ couleur+" !");
	}

	@Override
	public void sePresenter() {
		String txt = String.format("Bonjour, je suis %s, %s est ma boisson favorite, ma robe est %s.",this.getNom(), this.getBoisson(), this.couleurRobe);
		parler(txt);
	}
	

}
