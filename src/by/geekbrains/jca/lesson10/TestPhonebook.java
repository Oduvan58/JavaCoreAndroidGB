package by.geekbrains.jca.lesson10;

public class TestPhonebook {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add(22073, "Depp");
        phonebook.add(23673, "Pit");
        phonebook.add(14991, "Depp");
        phonebook.add(97659, "Soloduha");
        phonebook.add(75344, "Pit");

        phonebook.get("Pit");
        phonebook.get("Depp");
        phonebook.get("Soloduha");
        phonebook.get("Stark");

    }
}
