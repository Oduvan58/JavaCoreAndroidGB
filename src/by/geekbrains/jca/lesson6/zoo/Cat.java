package by.geekbrains.jca.lesson6.zoo;

public class Cat extends Animal {

    public static final int RUN_DISTANCE = 200;
    public static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= RUN_DISTANCE)
            System.out.printf("Cat %s ran %d meters.\n", super.name, distance);
        else System.out.println("The cat doesn't run like that!");
    }

    @Override
    public void swim(int distance) {
        System.out.println("The cat can't swim!");
    }
}
