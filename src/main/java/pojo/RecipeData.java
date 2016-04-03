package pojo;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.annotation.Generated;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public @Data class RecipeData {
	
	public String searchRequest;
	public String answerUrl;
	public Boolean sure;
	
	public String getRecipeUrl() {
		Document doc;
		try {
			doc = Jsoup.connect("http://www.cooks.com/rec/search?q=" + this.searchRequest).get();
		} catch (IOException e) {
			return "A recommendation could not be found";
		}
		List<Element> links = doc.select("body div.centered div.row div a[href]");
		for(int i = 0; i < links.size(); i++) {
			Element randomResult = links.get(new Random().nextInt(links.size() - 1));
			String randomStr = randomResult.attr("href");
			if (randomStr.contains("recipe")) {
				return randomStr;
			}
		}
		return "A recommendation could not be found";
	}
}