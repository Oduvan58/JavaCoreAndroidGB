package by.geekbrains.jca.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();
    public static String[] words = {"apple", "orange", "lemon", "banana", "apricot",
            "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
            "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
            "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        System.out.println("Try to guess the word!");
        String randomWord = getRandomWord().toLowerCase();
        boolean isSuccess;

        do {
            String userWord = sc.next().toLowerCase();
            isSuccess = randomWord.equals(userWord);
            if (!isSuccess) {
                System.out.println("False! Hint: " + getHint(randomWord, userWord));
            }
        } while (!isSuccess);
        System.out.println("Congratulations, you have won!");
    }

    public static String getRandomWord() {
        return words[random.nextInt(words.length)];
    }

    public static String getHint(String rWord, String uWord) {
        int rWordLength = rWord.length();
        int uWordLength = uWord.length();
        char[] elements = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};

        for (int i = 0; i < elements.length; i++) {
            if (i < rWordLength && i < uWordLength && rWord.charAt(i) == uWord.charAt(i)) {
                elements[i] = rWord.charAt(i);
            } else {
                elements[i] = '#';
            }
        }
        return String.valueOf(elements);
    }
}
