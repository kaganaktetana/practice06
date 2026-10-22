package semester1.practice06;

public class Task_12 {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        light.changeColor("Червоний");
        light.showSignal();

        light.changeColor("Жовтий");
        light.showSignal();

        light.changeColor("Зелений");
        light.showSignal();
    }
}

class TrafficLight {
    String currentColor;

    public void changeColor(String newColor) {
        currentColor = newColor;
    }

    public void showSignal() {
        if (currentColor.equals("Червоний")) {
            System.out.println("Стій!");
        } else if (currentColor.equals("Жовтий")) {
            System.out.println("Увага!");
        } else if (currentColor.equals("Зелений")) {
            System.out.println("Їдь!");
        }
    }
}