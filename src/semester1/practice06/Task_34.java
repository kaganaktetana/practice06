package semester1.practice06;

public class Task_34 {
    public static void main(String[] args) {
        ArrayStats stats = new ArrayStats();

        int[] numbers = {12, 7, 4, 9, 15, 20, 3, 8, 11, 6};
        stats.setNumbers(numbers);

        System.out.println("Парних чисел: " + stats.countEvens());
        System.out.println("Непарних чисел: " + stats.countOdds());
        System.out.println("Сума чисел: " + stats.calculateSum());
    }
}

class ArrayStats {
    private int[] numbers;

    public void setNumbers(int[] nums) {
        numbers = nums;
    }

    public int countEvens() {
        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public int countOdds() {
        int count = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public int calculateSum() {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}