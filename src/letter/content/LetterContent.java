package letter.content;
import letter.Letter;

public class LetterContent extends Content{
	protected Letter<?> letter;

	public Letter<?> getLetter() {
		return letter;
	}

	public LetterContent(Letter<?> letter){
		super();
		this.letter= letter;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "whose content is " + this.letter;
	}
}
