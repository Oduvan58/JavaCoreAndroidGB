package by.geekbrains.jca.lesson11.fruits;

public class FruitBox {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        appleBox.info();
        orangeBox.info();
        appleBox1.info();

        for (int i = 0; i < 5; i++) {
            appleBox.add(new Apple());
        }
        for (int i = 0; i < 10; i++) {
            orangeBox.add(new Orange());
        }
        for (int i = 0; i < 7; i++) {
            appleBox1.add(new Apple());
        }

        appleBox.info();
        orangeBox.info();
        appleBox1.info();

        Float appleWeight = appleBox.getWeight();
        Float orangeWeight = orangeBox.getWeight();
        Float appleWeight1 = appleBox1.getWeight();
        System.out.println("The apple box weighs: " + appleWeight);
        System.out.println("The orange box weighs: " + orangeWeight);
        System.out.println("The apple box1 weighs: " + appleWeight1);

        System.out.println("Compare the weight:");
        System.out.println("Apples with oranges: " + appleBox.compare(orangeBox));
        System.out.println("Apples1 with oranges: " + appleBox1.compare(orangeBox));

        appleBox.pourToAnotherBox(appleBox1);
//        appleBox1.pourToAnotherBox(orangeBox);

        appleBox.info();
        appleBox1.info();
        orangeBox.info();

    }
}
