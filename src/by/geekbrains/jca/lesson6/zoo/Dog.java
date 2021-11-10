package by.geekbrains.jca.lesson6.zoo;

public class Dog extends Animal {

    public static final int RUN_DISTANCE = 500;
    public static final int SWIM_DISTANCE = 10;
    public static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= RUN_DISTANCE)
            System.out.printf("Dog %s ran %d meters.\n", super.name, distance);
        else System.out.println("The dog doesn't run like that!");
    }

    @Override
    public void swim(int distance) {
        if (distance >= 0 && distance <= SWIM_DISTANCE)
            System.out.printf("Dog %s swam %d meters.\n", super.name, distance);
        else System.out.println("The dog doesn't swim like that!");
    }
}
