package by.geekbrains.jca.lesson7;

public class FeedCats {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Belka", 28),
                new Cat("Murka", 73),
                new Cat("Murzik", 46),
                new Cat("Pushok", 57),
                new Cat("Barsik", 82)
        };

        Plate plate = new Plate(250);

        plate.printInfo();
        for (Cat cat : cats) {
            if (!plate.checkFood(cat.getAppetite())) {
                System.out.println("Cat " + cat.getName() + " couldn't eat, not enough food! Satiety of the cat " + cat.isSatiety());
                plate.increaseFood(100);
            }
            cat.eat(plate);
            System.out.println("Cat " + cat.getName() + " ate " + cat.getAppetite() +
                    " grams of feed, the rest in the plate " + plate.getFood() + ", satiety of the cat " + cat.isSatiety());
        }
        plate.printInfo();
    }
}
