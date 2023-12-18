import java.util.HashMap;
import java.util.Map;

public class wordCount {

    public static Map<String, Integer> countWords(String paragraph) {
        if(paragraph.length()==0){
            return null;
        }
        String[] words = paragraph.split("\\s+");

        

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {

            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }

}
