package semester1.practice06;

public class Task_36 {
    public static void main(String[] args) {
        TemperatureTracker tracker = new TemperatureTracker();

        double[] temps = {12.5, 15.0, 18.3, 21.0, 19.5, 16.2, 14.0};
        tracker.setTemps(temps);

        System.out.println("Днів вище 15°C: "
                + tracker.countDaysAbove(15));

        tracker.printWeeklyReport();
    }
}

class TemperatureTracker {
    private double[] dailyTemps = new double[7];

    public void setTemps(double[] temps) {
        if (temps == null || temps.length != 7) {
            System.out.println("Потрібно передати температури за 7 днів.");
            return;
        }

        dailyTemps = temps.clone();
    }

    public int countDaysAbove(double threshold) {
        int count = 0;

        for (double temp : dailyTemps) {
            if (temp > threshold) {
                count++;
            }
        }

        return count;
    }

    public void printWeeklyReport() {
        String[] days = {
                "Понеділок", "Вівторок", "Середа",
                "Четвер", "П'ятниця", "Субота", "Неділя"
        };

        int warmestIndex = 0;

        System.out.println("Звіт за тиждень:");

        for (int i = 0; i < dailyTemps.length; i++) {
            System.out.println(days[i] + ": " + dailyTemps[i] + " °C");

            if (dailyTemps[i] > dailyTemps[warmestIndex]) {
                warmestIndex = i;
            }
        }

        System.out.println("Найтепліший день: "
                + days[warmestIndex] + " ("
                + dailyTemps[warmestIndex] + " °C)");
    }
}