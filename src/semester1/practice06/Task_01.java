package semester1.practice06;

public class Task_01 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Денис";
        s1.age = 19;
        s1.gpa = 4.75;

        System.out.println(s1.name + ", " + s1.age + ", " + s1.gpa);
    }
}

class Student {
    String name;
    int age;
    double gpa;
}