package by.geekbrains.jca.lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        food -= appetite;
    }

    public void printInfo() {
        System.out.println("Plate: " + food);
    }

    public boolean checkFood(int appetite) {
        return (food - appetite) >= 0;
    }

    public void increaseFood(int add) {
        food += add;
        System.out.printf("%d grams of feed were added to the plate\n", add);
    }

    public int getFood() {
        return food;
    }
}
