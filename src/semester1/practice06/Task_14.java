package semester1.practice06;

public class Task_14 {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        lamp.turnOn();
        lamp.status();

        lamp.toggle();
        lamp.status();

        lamp.toggle();
        lamp.status();
    }
}

class Lamp {
    boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void toggle() {
        isOn = !isOn;
    }

    public void status() {
        if (isOn) {
            System.out.println("Лампа світить");
        } else {
            System.out.println("Лампа вимкнена");
        }
    }
}