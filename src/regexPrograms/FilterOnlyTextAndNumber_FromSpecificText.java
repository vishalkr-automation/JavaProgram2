package regexPrograms;

public class FilterOnlyTextAndNumber_FromSpecificText {

	public static void main(String[] args) {
		String str="Typeinthe box below: KY 82 XJ ";
		
		String result=str.split("below")[1].replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(result);

	}

}
