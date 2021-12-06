package by.geekbrains.jca.lesson11.fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> list;

    public Box(){
        list = new ArrayList<T>();
    }

    public float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void pourToAnotherBox(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

    public void add(T obj) {
        list.add(obj);
    }

    public void info() {
        if (list.isEmpty()) {
            System.out.println("The box is empty!");
        } else {
            System.out.println("The box has " + list.size() + " " + list.get(0).toString());
        }
    }

    public List<T> getList() {
        return list;
    }
}
