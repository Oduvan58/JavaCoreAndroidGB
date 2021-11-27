package by.geekbrains.jca.lesson10;

import java.util.*;

public class UniqueWord {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>(Arrays.asList("Germany", "Belarus", "Russia", "Poland",
                "Belarus", "England", "France", "Germany", "Portugal", "Italy", "France", "Japan"));
        System.out.println("Initial list: " + wordList);

        Set<String> uniqueWords = new HashSet<>(wordList);
        System.out.println("List of unique words: " + uniqueWords);

        Map<String, Integer> repeatWord = new HashMap<>();
        for (String word : wordList) {
            repeatWord.put(word, repeatWord.getOrDefault(word, 0) + 1);
        }
        System.out.println("Repeat words: " + repeatWord);
    }
}
