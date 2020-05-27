package by.student.budanitskaya.aggregation_and_composition.task1;

public class Text {
	
	private String header;
	private String body = "";
	private String text;
	
	public Text(Word word) {
		header = word.getWord();
	}

	public Text(Sentence sentence) {
		header = sentence.getValue();
	}
	
	
	public Text(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public String getHeader() {
		return header;
	}

	public void addBody(Word word) {
		body += " " + word.getWord();
	}

	public void addBody(Sentence sentence) {
		body += " " + sentence.getValue();
	}

	public String getBody() {
		return body;
	}
	
	// метод для вывода текста на консоль
	
	public void printText() {
		System.out.println(getText());		
	}
}
