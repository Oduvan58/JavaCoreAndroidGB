package by.geekbrains.jca.lesson11;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"audi", "bmw", "opel", "volkswagen", "mercedes", "porsche", "lada"};
        System.out.println("Initial array: " + Arrays.toString(arr));
        changeElements(arr, 1, 5);
        System.out.println("Modified array: " + Arrays.toString(arr));
        System.out.println();

        Integer[] intArr = {28, 12, 7, 456, 89, 4, 77};
        System.out.println("Initial array: " + Arrays.toString(intArr));
        List<Integer> list = arrayToList(intArr);
        System.out.println("Converted to List: " + list.getClass() + " - " + list);
    }

    private static <T> void changeElements(T[] arr, int index1, int index2) {
        for (int i = 0; i < arr.length; i++) {
            T temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }

    private static <V> List<V> arrayToList(V[] arr) {
        return Arrays.asList(arr);
    }
}
