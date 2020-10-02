package word;

import java.util.Map;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        String words = "c b b c a c c a d z h h l k l";
        Map<String, Integer> countWord = new TreeMap<>();
        for (String word :
                words.split(" ")) {
            if (countWord.containsKey(word)) {
                countWord.put(word, countWord.get(word) + 1);
            } else countWord.put(word, 1);
        }
        System.out.println(countWord);
    }
}
