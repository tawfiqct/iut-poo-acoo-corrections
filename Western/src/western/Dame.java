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
		System.out.println("IIIIHHHHHHHHHHIIIHHHHHHHHH");
	}
	public void kidnapper(){
		this.hurler();
		this.libre = false;
	}

	public void liberer(){
		this.libre = true;
		System.out.println("Merci !!!!");
	}
	
	public void changerRobe(String couleur){
		this.couleurRobe = couleur;
		System.out.println("Regardez ma nouvelle robe "+ couleur+" !");
	}
	@Override
	public void quelEstTonNom() {
		
		System.out.println("Miss "+ this.getNom());
	}
	

}
