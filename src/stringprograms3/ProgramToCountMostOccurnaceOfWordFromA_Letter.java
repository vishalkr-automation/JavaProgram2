package stringprograms3;

//https://stackoverflow.com/questions/53337839/find-the-most-repeated-word-in-a-string

public class ProgramToCountMostOccurnaceOfWordFromA_Letter{
	
	public static void main(String...strings) {
        String str = "India is my country. India";
        String[] words = str.split("\\s+");
        int finalCount = 0;
        int tempCount = 0;
        String mostlyUsedWord = null;
        for (String word: words) {
            tempCount = 0;
            for (String w: words) {
                if (word.equalsIgnoreCase(w)) {
                    tempCount++;
                }
            }
            if (tempCount >= finalCount) {
                finalCount = tempCount;
                mostlyUsedWord = word;
            }
        }
        System.out.println("mostlyUsedWord:: = " + mostlyUsedWord + " ,count:: = " + finalCount);
    }
}
