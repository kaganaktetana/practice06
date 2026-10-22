package semester1.practice06;

public class Task_37 {
    public static void main(String[] args) {
        ArraySearcher searcher = new ArraySearcher();

        searcher.setData(new int[]{10, 25, 7, 42, 18});

        System.out.println("Число 42 є в масиві: "
                + searcher.contains(42));

        System.out.println("Число 99 є в масиві: "
                + searcher.contains(99));

        System.out.println("Індекс числа 7: "
                + searcher.findIndex(7));

        System.out.println("Індекс числа 99: "
                + searcher.findIndex(99));
    }
}

class ArraySearcher {
    private int[] data;

    public void setData(int[] data) {
        this.data = data;
    }

    public boolean contains(int target) {
        return findIndex(target) != -1;
    }

    public int findIndex(int target) {
        if (data == null) {
            return -1;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }

        return -1;
    }
}