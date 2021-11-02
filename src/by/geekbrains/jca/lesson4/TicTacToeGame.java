package by.geekbrains.jca.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    private static char[][] field;
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '.';
    private static final int SIZE_FIELD = 5;
    private static final int DOTS_TO_WIN = 4;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    private static int scoreHuman;
    private static int scoreAi;
    private static int roundCounter;

    public static void main(String[] args) {
        play();
    }

    private static void play() {
        while (true) {
            playRound();
            System.out.printf("SCORE: HUMAN      AI\n" +
                    "         %d        %d\n", scoreHuman, scoreAi);
            System.out.print("Wanna play again? Y or N >>> ");
            if (!scanner.next().toLowerCase().equals("y")) {
                System.out.println("Good bye!");
                break;
            }
        }
    }

    private static void playRound() {
        System.out.printf("ROUND #%d\n", roundCounter++);
        initField();
        printField();
        while (true) {
            humanTurn();
            printField();
            if (checkAll(DOT_X)) break;
            aiTurn();
            printField();
            if (checkAll(DOT_O)) break;
        }
    }

    private static boolean checkAll(char dot) {
        if (checkWin(dot)) {
            if (dot == DOT_X) {
                System.out.println("Human Win!");
                scoreHuman++;
            } else {
                System.out.println("AI Win!");
                scoreAi++;
            }
            return true;
        }
        if (checkDraw()) return true;
        return false;
    }

//    Task 2.
//    private static boolean checkWin(char dot) {
//        for (int i = 0; i < SIZE_FIELD; i++) {
//            if ((field[i][0] == dot && field[i][1] == dot && field[i][2] == dot)
//                    || (field[0][i] == dot && field[1][i] == dot && field[2][i] == dot))
//                return true;
//            if ((field[0][0] == dot && field[1][1] == dot && field[2][2] == dot)
//                    || (field[2][0] == dot && field[1][1] == dot && field[0][2] == dot))
//                return true;
//        }
//        return false;
//    }

    //    Task 3.
    private static boolean checkWin(char dot) {
        int hor;
        int ver;
        int diag1;
        int diag2;
        for (int i = 0; i < SIZE_FIELD; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < SIZE_FIELD; j++) {
                if (field[i][j] == dot) hor++;
                if (field[j][i] == dot) ver++;
            }
            if (hor == DOTS_TO_WIN || ver == DOTS_TO_WIN) return true;
        }
        diag1 = 0;
        diag2 = 0;
        for (int i = 0; i < SIZE_FIELD; i++) {
            if (field[i][i] == dot) diag1++;
            if (field[i][SIZE_FIELD - i - 1] == dot) diag2++;
        }
        return diag1 == DOTS_TO_WIN || diag2 == DOTS_TO_WIN;
    }

    private static boolean checkDraw() {
        for (int y = 0; y < SIZE_FIELD; y++) {
            for (int x = 0; x < SIZE_FIELD; x++) {
                if (isCellEmpty(y, x)) return false;
            }
        }
        System.out.println("DRAW!");
        return true;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE_FIELD);
            y = random.nextInt(SIZE_FIELD);
        } while (!isCellEmpty(y, x));
        field[y][x] = DOT_O;
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.print("Please enter coordinates of your turn x & y split by whitespace >>>>>>>> ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x) || !isCellEmpty(y, x));
        field[y][x] = DOT_X;
    }

    private static boolean isCellValid(int y, int x) {
        return x >= 0 && y >= 0 && x < SIZE_FIELD && y < SIZE_FIELD;
    }

    private static boolean isCellEmpty(int y, int x) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void initField() {
        field = new char[SIZE_FIELD][SIZE_FIELD];
        for (int i = 0; i < SIZE_FIELD; i++) {
            for (int j = 0; j < SIZE_FIELD; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.print('+');
        for (int i = 0; i < SIZE_FIELD * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }
        System.out.println();
        for (int i = 0; i < SIZE_FIELD; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < SIZE_FIELD; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i < SIZE_FIELD * 2 + 1; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
