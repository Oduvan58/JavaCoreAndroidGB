package by.geekbrains.jca.lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook {

    private Map<Integer, String> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(int phoneNumber, String surname) {
        phonebook.put(phoneNumber, surname);
    }

    public void get(String surname) {
        if (phonebook.containsValue(surname)) {
            Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
            for (Map.Entry<Integer, String> temp : set) {
                if (temp.getValue().equals(surname)) {
                    System.out.println(temp.getValue() + "-" + temp.getKey());
                }
            }
        } else System.out.println("There is no such a surname!");
    }
}
