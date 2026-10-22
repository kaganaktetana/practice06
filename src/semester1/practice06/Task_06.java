package semester1.practice06;

public class Task_06 {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        phone.model = "Samsung Galaxy";
        phone.batteryLevel = 100;
        phone.isTurnedOn = true;

        phone.batteryLevel -= 35;

        if (phone.batteryLevel == 0) {
            phone.isTurnedOn = false;
        }

        System.out.println("Модель: " + phone.model);
        System.out.println("Заряд: " + phone.batteryLevel + "%");
        System.out.println("Увімкнений: " + phone.isTurnedOn);
    }
}

class Smartphone {
    String model;
    int batteryLevel;
    boolean isTurnedOn;
}