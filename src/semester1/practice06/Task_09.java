package semester1.practice06;

public class Task_09 {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        greeter.sayHello();
        greeter.sayHelloTo("Тетяна");
    }
}

class Greeter {
    public void sayHello() {
        System.out.println("Привіт усім!");
    }

    public void sayHelloTo(String name) {
        System.out.println("Привіт, " + name + "! Раді тебе бачити.");
    }
}