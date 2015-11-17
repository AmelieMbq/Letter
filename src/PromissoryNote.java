
public class PromissoryNote extends Letter<MoneyContent> {
	
	
	
	public PromissoryNote(double content) {
		super();
		this.content = new MoneyContent(content);
	}

	@Override
	public double getCost() {
		return 1 + ((1/100)*this.content.getAmount());
				}

	@Override
	public void doAction() {
		this.sender.getBankAccount().debit(this.content.getAmount());
		this.receiver.getBankAccount().credit(this.content.getAmount());
		SimpleLetter thanksLetter = new SimpleLetter ("Thanks for a promissory note letter whose content is a money content"+this.content.getAmount());
		this.receiver.getCity().sendLetter(thanksLetter);
	}

	
}