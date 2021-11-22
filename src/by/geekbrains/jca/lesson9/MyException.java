package by.geekbrains.jca.lesson9;

import java.util.Arrays;

public class MyException {
    public static void main(String[] args) {
        String[][] arr = {
                {"2", "8", "1", "7"},
                {"1", "3", "3", "1"},
                {"2", "1", "1", "7"},
                {"1", "2", "1", "1"},
        };

        try {
            System.out.println("Sum of array elements: " + testException(arr));
        } catch (MyArraySizeException e) {
            System.out.println("Incorrect array size!");
        } catch (MyArrayDataException e) {
            System.out.println("Incorrect array element!");
            System.out.println("Error in the cell: " + Arrays.toString(arr[e.a]) + " - " + e.b + " element.");
        }
    }

    public static int testException(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
