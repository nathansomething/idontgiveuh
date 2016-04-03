package pojo;
import lombok.Data;

public @Data class YesNoDecision {

	private String question;
	private Boolean answer;
	private Boolean sure;
	
	public String removeQuestion() {
		if (this.question.charAt(this.question.length() - 1) == '?') {
			return this.question.substring(0, this.question.length() - 2);
		} 
		else {
			return this.question;
		}
	}
}
