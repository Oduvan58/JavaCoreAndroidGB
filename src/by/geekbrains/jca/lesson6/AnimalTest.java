package by.geekbrains.jca.lesson6;

import by.geekbrains.jca.lesson6.zoo.Animal;
import by.geekbrains.jca.lesson6.zoo.Cat;
import by.geekbrains.jca.lesson6.zoo.Dog;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Muchtar"),
                new Cat("Belka"),
                new Cat("Tima"),
                new Dog("Tuzik"),
                new Dog("Valet")
        };

        animals[0].run(280);
        animals[4].swim(28);
        animals[1].run(140);
        animals[2].swim(5);

        System.out.println();

        System.out.println(Animal.animalCount + " created animals.");
        System.out.println(Dog.dogCount + " created dogs.");
        System.out.println(Cat.catCount + " created cats.");
    }
}
