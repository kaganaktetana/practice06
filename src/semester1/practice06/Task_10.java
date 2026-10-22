package semester1.practice06;

public class Task_10 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.species = "Кіт";
        cat.name = "Мурчик";

        Animal dog = new Animal();
        dog.species = "Собака";
        dog.name = "Рекс";

        cat.printInfo();
        cat.makeSound();

        System.out.println();

        dog.printInfo();
        dog.makeSound();
    }
}

class Animal {
    String species;
    String name;

    public void makeSound() {
        System.out.println(name + " видає звук!");
    }

    public void printInfo() {
        System.out.println("Вид: " + species);
        System.out.println("Кличка: " + name);
    }
}