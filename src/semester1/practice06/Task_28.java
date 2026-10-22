package semester1.practice06;

public class Task_28 {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();

        thermometer.setTemperature(25.5);
        System.out.println("Температура: "
                + thermometer.getTemperature() + " °C");

        thermometer.setTemperature(-300);
        System.out.println("Температура: "
                + thermometer.getTemperature() + " °C");
    }
}

class Thermometer {
    private double temperature;

    public void setTemperature(double t) {
        if (t < -273.15) {
            System.out.println("Помилка: температура нижча за абсолютний нуль.");
        } else {
            temperature = t;
        }
    }

    public double getTemperature() {
        return temperature;
    }
}
