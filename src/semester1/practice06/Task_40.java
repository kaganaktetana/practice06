package semester1.practice06;

public class Task_40 {
    public static void main(String[] args) {
        MatrixDiagonals matrix = new MatrixDiagonals();

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        matrix.setMatrix(numbers);

        System.out.println("Сума головної діагоналі: "
                + matrix.getMainDiagonalSum());

        System.out.println("Сума побічної діагоналі: "
                + matrix.getAntiDiagonalSum());

        System.out.println("Діагоналі мають однакові суми: "
                + matrix.isDiagonalSymmetric());
    }
}

class MatrixDiagonals {
    private int[][] matrix;

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getMainDiagonalSum() {
        if (!isSquareMatrix()) {
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }

    public int getAntiDiagonalSum() {
        if (!isSquareMatrix()) {
            return 0;
        }

        int sum = 0;
        int length = matrix.length;

        for (int i = 0; i < length; i++) {
            sum += matrix[i][length - 1 - i];
        }

        return sum;
    }

    public boolean isDiagonalSymmetric() {
        return isSquareMatrix()
                && getMainDiagonalSum() == getAntiDiagonalSum();
    }

    private boolean isSquareMatrix() {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        for (int[] row : matrix) {
            if (row == null || row.length != matrix.length) {
                return false;
            }
        }

        return true;
    }
}
