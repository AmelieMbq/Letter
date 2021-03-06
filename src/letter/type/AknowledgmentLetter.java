package letter.type;

import inhabitant.Inhabitant;
import letter.content.Content;

/**
 * Class which represents an aknowledgment of receipt letter which is a simple letter.
 * @author landschoot
 *
 */
public class AknowledgmentLetter extends SimpleLetter {

	public AknowledgmentLetter(Inhabitant sender, Inhabitant receiver, Content<?> content, Content<?> contentSup) {
		super("aknowlegment of receipt for a registered letter whose content is a"+content+"whose content is"+contentSup, sender, receiver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "an aknowledgment of receipt wich is a simple letter "+this.content;
	}

}
