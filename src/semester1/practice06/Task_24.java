package semester1.practice06;

public class Task_24 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.a = 3;
        triangle.b = 4;
        triangle.c = 5;

        System.out.println("Трикутник правильний: "
                + triangle.isValid());
        System.out.println("Периметр: "
                + triangle.getPerimeter());
        System.out.println("Площа: " + triangle.getArea());
    }
}

class Triangle {
    double a;
    double b;
    double c;

    public boolean isValid() {
        return a + b > c
                && a + c > b
                && b + c > a;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        if (!isValid()) {
            return 0.0;
        }

        double p = getPerimeter() / 2;

        return Math.sqrt(
                p * (p - a) * (p - b) * (p - c)
        );
    }
}