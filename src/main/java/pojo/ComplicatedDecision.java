package pojo;
import java.util.ArrayList;

import lombok.Data;

public @Data class ComplicatedDecision {
	
	private ArrayList<String> choices;
	private String answer;
	private Boolean sure;
}