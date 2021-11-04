package by.geekbrains.jca.lesson5;

public class Run {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Yancheuski Pavel Andreevich", "Lead engineer",
                "pavelarteta93@gmail.com", 7359233, 1500.73, 28);
        employees[1] = new Employee("Bobritskaya Viktoria Aleksandrovna", "Regional manager",
                "victirybob@gmail.com", 1110718, 2415.39, 25);
        employees[2] = new Employee("Ceshko Oleg Vasilievich", "Head of department",
                "borov50@gmail.com", 3326784, 1691.02, 50);
        employees[3] = new Employee("klimovich Anton Kazimirovich", "Chief engineer",
                "antonklimovich@gmail.com", 2821309, 3129.98, 38);
        employees[4] = new Employee("Kurnysh Natalia Vladimirovna", "Engineer",
                "pristrom@gmail.com", 6689231, 973.37, 42);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) employee.printInfo();
        }
    }
}
