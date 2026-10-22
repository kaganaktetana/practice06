package semester1.practice06;

public class Task_04 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 7.5;
        rectangle.height = 4.0;

        double area = rectangle.width * rectangle.height;
        double perimeter = 2 * (rectangle.width + rectangle.height);

        System.out.println("Площа: " + area);
        System.out.println("Периметр: " + perimeter);
    }
}

class Rectangle {
    public double width;
    public double height;
}