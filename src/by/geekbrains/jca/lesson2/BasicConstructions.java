package by.geekbrains.jca.lesson2;

import java.util.Arrays;

public class BasicConstructions {
    public static void main(String[] args) {

        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();

        int[] arr = {2, 5, 3, 7, 12, 1, 28};
        System.out.println(taskSix(arr));
    }


    public static void taskOne() {
        int[] arr = {1, 1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void taskTwo() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void taskThree() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
            else arr[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void taskFour() {
        int[][] arr = new int[3][3];
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if ((y == x) || y == arr[y].length - 1 - x) arr[y][x] = 1;
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }
    }


    public static void taskFive() {
        int[] arr = {11, 12, 45, 86, 91, 28, 76, 90};
        int min = arr[0];
        int max = arr[0];
        for (int e : arr) {
            if (e < min) min = e;
            if (e > max) max = e;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("max element: " + max + ", min element: " + min);
    }


    public static boolean taskSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }
}
