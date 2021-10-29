package by.geekbrains.jca.lesson3;

import java.util.Scanner;

public class GuessNumber {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            runGame();
            System.out.println("Repeat the game again? 1 - Yes / 0 - No");
        } while (sc.nextInt() == 1);
    }

    public static void runGame() {
        int userNumber = getNumberFromScanner("Enter a number from 0 to 9:", 0, 9);
        int randomNumber = (int) (Math.random() * 9);
        int tryCount;
        int maxTryCount = 3;
        for (tryCount = 1; tryCount < maxTryCount; tryCount++) {
            if (userNumber == randomNumber) {
                System.out.println("Congratulations, you have won!");
                break;
            } else if (userNumber > randomNumber) {
                System.out.println("You entered a large number");
            } else {
                System.out.println("You entered a small number");
            }
            userNumber = getNumberFromScanner("Try again. Enter a number from 0 to 9:", 0, 9);
        }
        if (tryCount == maxTryCount) System.out.println("You have lost!");
    }

    public static int getNumberFromScanner(String message, int min, int max) {
        int userNumber;
        do {
            System.out.println(message);
            userNumber = sc.nextInt();
        } while (userNumber < min || userNumber > max);
        return userNumber;
    }
}
