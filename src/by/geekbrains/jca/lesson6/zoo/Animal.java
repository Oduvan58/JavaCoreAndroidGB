package by.geekbrains.jca.lesson6.zoo;

public abstract class Animal {

    protected String name;
    public static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
