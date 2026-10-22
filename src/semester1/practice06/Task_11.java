package semester1.practice06;

public class Task_11 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.increment();
        counter.increment();
        counter.increment();

        counter.decrement();
        counter.printCount();
    }
}

class Counter {
    int count;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void reset() {
        count = 0;
    }

    public void printCount() {
        System.out.println("Лічильник: " + count);
    }
}