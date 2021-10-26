package by.geekbrains.jca.lesson1;

public class General {

    public static void main(String[] args) {

        System.out.println(printCalculations(21.2f, 13.33f, 34.1f, 17.89f));
        System.out.println(checkAmount(10, 10));
        checkNumber(-28);
        System.out.println(checkNumberPositiveOrNegative(28));
        printHello("Pavel");
        checkLeapYear(2000);
    }

    public static float printCalculations(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean checkAmount(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Number " + a + " is positive");
        } else {
            System.out.println("Number " + a + " is negative");
        }
    }

    public static boolean checkNumberPositiveOrNegative(int a) {
        return a < 0;
    }

    public static void printHello(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

}
