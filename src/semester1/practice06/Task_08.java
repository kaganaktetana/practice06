package semester1.practice06;

public class Task_08 {
    public static void main(String[] args) {
        Student first = new Student();
        first.name = "Іван";

        Student second = first;
        second.name = "Петро";

        System.out.println(first.name);

        // Обидві змінні посилаються на один об'єкт,
        // тому зміна через second змінює ім'я і для first.
    }

    static class Student {
        String name;
    }
}