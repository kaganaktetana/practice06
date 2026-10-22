package semester1.practice06;

public class Task_19 {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double fahrenheit = converter.celsiusToFahrenheit(25);
        double celsius = converter.fahrenheitToCelsius(fahrenheit);

        System.out.println("25 градусів Цельсія = "
                + fahrenheit + " градусів Фаренгейта");

        System.out.println(fahrenheit + " градусів Фаренгейта = "
                + celsius + " градусів Цельсія");
    }
}

class TemperatureConverter {
    public double celsiusToFahrenheit(double c) {
        return c * 1.8 + 32;
    }

    public double fahrenheitToCelsius(double f) {
        return (f - 32) / 1.8;
    }
}