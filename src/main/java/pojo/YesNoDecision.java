package pojo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import lombok.Data;

public @Data class YesNoDecision {

	private String question;
	private Boolean answer;
	private Boolean sure;
	final private ArrayList<String> comments = new ArrayList<String>(
					Arrays.asList("Am I Sure? Does the Pope shit in the woods? Because I still don't know.", 
						          "Can one really ever be sure of anything?", 
						          "You know, just to throw you a curveball, I'm not sure. Go away.",
						          "Yes, I am sure.",
						          "Si, Oui, Ja, Da, Tak - How many languages do I need to get that across?",
						          "I am all-knowing, of course I'm sure."));
	
	static public String removeQuestion(String question) {
		if (question.charAt(question.length() - 1) == '?') {
			return question.substring(0, question.length() - 1);
		} 
		else {
			return question;
		}
	}
	
	static public boolean answer(boolean ans) {
		if (!ans) {
			return new Random().nextBoolean();
		}
		else {
			return ans;
		}
	}
	
	static public String getComment(ArrayList<String> comments) {
		return comments.get(new Random().nextInt(comments.size() - 1));
	}
	
	
	
}
