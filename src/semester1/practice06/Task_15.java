package semester1.practice06;

public class Task_15 {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();

        stopwatch.tick();
        stopwatch.addSeconds(124);
        stopwatch.displayTime();
    }
}

class Stopwatch {
    int seconds;

    public void tick() {
        seconds++;
    }

    public void addSeconds(int s) {
        seconds += s;
    }

    public void displayTime() {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.printf("%02d:%02d%n", minutes, remainingSeconds);
    }
}