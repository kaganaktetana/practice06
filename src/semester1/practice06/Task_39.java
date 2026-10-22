package semester1.practice06;

public class Task_39 {
    public static void main(String[] args) {
        Matrix2D matrix = new Matrix2D();

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        matrix.setGrid(numbers);
        matrix.printMatrix();

        System.out.println("Сума всіх чисел: "
                + matrix.getTotalSum());

        System.out.println("Сума другого рядка: "
                + matrix.getRowSum(1));
    }
}

class Matrix2D {
    private int[][] grid;

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public void printMatrix() {
        if (grid == null) {
            System.out.println("Матрицю не задано.");
            return;
        }

        for (int[] row : grid) {
            for (int number : row) {
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
    }

    public int getTotalSum() {
        int sum = 0;

        if (grid == null) {
            return 0;
        }

        for (int[] row : grid) {
            for (int number : row) {
                sum += number;
            }
        }

        return sum;
    }

    public int getRowSum(int rowIndex) {
        if (grid == null || rowIndex < 0
                || rowIndex >= grid.length) {
            System.out.println("Некоректний індекс рядка.");
            return 0;
        }

        int sum = 0;

        for (int number : grid[rowIndex]) {
            sum += number;
        }

        return sum;
    }
}