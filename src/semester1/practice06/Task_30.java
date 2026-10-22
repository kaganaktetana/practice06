package semester1.practice06;

public class Task_30 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Тетяна");
        person1.setAge(17);

        Person person2 = new Person();
        person2.setName("Олена");
        person2.setAge(20);

        person1.printSummary();
        person2.printSummary();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Помилка: некоректний вік.");
        }
    }

    public void printSummary() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("----------------");
    }
}