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
	
	public void hurler(){
		System.out.println(this.getNom() + " - " + "IIIIHHHHHHHHHHIIIHHHHHHHHH");
	}
	public void kidnapper(){
		this.hurler();
		this.libre = false;
	}

	public void liberer(){
		this.libre = true;
		System.out.println(this.getNom() + " - " + "Merci !!!!");
	}
	
	public void changerRobe(String couleur){
		this.couleurRobe = couleur;
		System.out.println("Regardez ma nouvelle robe "+ couleur+" !");
	}
	@Override
	public void quelEstTonNom() {
		
		System.out.println(this.getNom() + " - " + "Miss "+ this.getNom());
	}
	@Override
	public void sePresenter() {
		String txt = String.format("%s - Bonjour, je suis %s, %s est ma boisson favorite, ma robe est %s.",this.getNom(), this.getNom(), this.getBoisson(), this.couleurRobe);
		System.out.println(txt);
	}
	

}
