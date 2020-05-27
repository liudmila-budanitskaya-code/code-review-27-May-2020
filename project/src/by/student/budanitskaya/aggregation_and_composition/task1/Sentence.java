package by.student.budanitskaya.aggregation_and_composition.task1;

public class Sentence {
	private String sentence;
	
	public Sentence() {
		super();
		this.sentence = "";
	}

	public Sentence(String sentence) {
		super();
		this.sentence = sentence;
	}

	public void addValue(Word word) {
		sentence += " " + word.getWord();
	}

	public String getValue() {
		return sentence;
	}
}