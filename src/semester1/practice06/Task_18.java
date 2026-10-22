package semester1.practice06;

public class Task_18 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5.0;

        System.out.println("Площа круга: " + circle.getArea());
        System.out.println("Довжина кола: " + circle.getCircumference());
    }
}

class Circle {
    double radius;

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}