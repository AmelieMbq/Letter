import java.util.List;


public class City {
	protected String name;
	protected List<Inhabitant> inhabitants;
	protected List<Letter<Content>> postbox;
	
	public City(String name) {
		this.name = name;
	}

	public City(String name, List<Inhabitant> inhabitants) {
		this.name = name;
		this.inhabitants = inhabitants;
	}

	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}


	public String getName() {
		return name;
	}

	public void setPostbox(List<Letter<Content>> postbox) {
		this.postbox = postbox;
	}
	
	
	public void addInhabitant(Inhabitant inhabitant){
		this.inhabitants.add(inhabitant);
	}
	
	public void sendLetter(Letter<Content> letter){
		this.postbox.add(letter);
		letter.getSender().getBankAccount().debit(letter.getCost());
	}
	
	public void distributeLetters(){
		for(Letter<Content> letter : postbox){
			letter.doAction();
			postbox.remove(letter);
		}
	}
}