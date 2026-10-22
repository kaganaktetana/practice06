package semester1.practice06;

public class Task_29 {
    public static void main(String[] args) {
        CarSpeedometer car = new CarSpeedometer();

        car.accelerate(100);
        System.out.println("Швидкість: " + car.getSpeed() + " км/год");

        car.accelerate(200);
        System.out.println("Швидкість: " + car.getSpeed() + " км/год");

        car.brake(300);
        System.out.println("Швидкість: " + car.getSpeed() + " км/год");
    }
}

class CarSpeedometer {
    private int speed = 0;

    public void accelerate(int delta) {
        if (delta > 0) {
            speed += delta;

            if (speed > 240) {
                speed = 240;
            }
        }
    }

    public void brake(int delta) {
        if (delta > 0) {
            speed -= delta;

            if (speed < 0) {
                speed = 0;
            }
        }
    }

    public int getSpeed() {
        return speed;
    }
}