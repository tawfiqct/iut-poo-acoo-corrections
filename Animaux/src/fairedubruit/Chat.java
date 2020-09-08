package fairedubruit;

public class Chat extends Animal  {

	public Chat(String nom) {
		super(nom);
	}
	
	public void Ronronner(){
		System.out.println("Rrrrr RRrrr RRrrrr");
	}

	@Override
	public String faireDuBruit() {
		return "Miaouu";
	}
}
