package RepeatedWord;

import java.util.HashMap;

public class RepeatedWord {
    public static String RepeatedWord(String input) {
        if (input == "") throw new IllegalArgumentException("No repeated word in an empty string");

        String splitword[] = input.split(" ");
        HashMap<String, Integer> hashWord = new HashMap<>();
        String current = "";

        for (String word: splitword) {
            current = word.toLowerCase().replaceAll("[^a-zA-Z]+$", "");
            if (hashWord.containsKey(current)) {
                return current;
            } else {
                hashWord.put(current, 1);
            }
        }return null;
    }
}
