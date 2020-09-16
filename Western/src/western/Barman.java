package western;

public class Barman  extends Humain{
//	Un barman est un humain dont la boisson favorite est le Vin. Il peut servir n’importe quel
//	humain, en lui donnant un verre de sa boisson favorite (les barmen ont un sixième sens pour
//	cela). Il est caractérisé par le nom de son bar. Par défaut, il s’agira du bar Chez (nom du
//	barman). La classe barman aura deux constructeurs. Soit on crée un barman en indiquant
//	uniquement son nom, soit on indique également le nom de son bar. Quand un barman se
//	présente, il n’oublie pas de mentionner le nom de son bar. Quand un barman parle, il termine
//	toutes ses phrases par "Coco.". 
	
	private String nomBar;
	
	public Barman(String nom) {
		super(nom);
		this.nomBar = nom;
	}

	public Barman(String nom, String nomBar) {
		super(nom);
		this.nomBar = nomBar;
		
	}
	
	public String getNomBar(){
		return "Chez " + this.nomBar;
	}

	
	public void servir(Humain humain){
		String str = String.format("%s - %s, voici ton verre de %s.", this.getNom(), humain.getNom(), humain.getBoisson());
		System.out.println(str);
		humain.boire();
	}
	@Override
	public void sePresenter() {
		String txt = String.format("%s - Bonjour, je suis %s, %s est ma boisson favorite, mon bar est \"Chez %s\".",this.getNom(), this.getNom(), this.getBoisson(), this.nomBar);
		System.out.println(txt);
	}
	@Override
	public void parler(String texte) {
		String txt = String.format("%s - %s Coco.", this.getNom() , texte);
		System.out.println(txt);
	}
}
