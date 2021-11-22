package by.geekbrains.jca.lesson9;

public class MyArrayDataException extends Exception {
    public int a;
    public int b;

    public MyArrayDataException(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
