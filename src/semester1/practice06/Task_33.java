package semester1.practice06;

public class Task_33 {
    public static void main(String[] args) {
        GradeBook book = new GradeBook();

        int[] grades = {85, 92, 78, 96, 65};
        book.setData("Тетяна", grades);

        System.out.println("Середній бал: " + book.getAverage());
        System.out.println("Найвища оцінка: " + book.getHighestGrade());
        System.out.println("Найнижча оцінка: " + book.getLowestGrade());
    }
}

class GradeBook {
    private String studentName;
    private int[] grades;

    public void setData(String name, int[] g) {
        studentName = name;
        grades = g;
    }

    public double getAverage() {
        if (grades == null || grades.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    public int getHighestGrade() {
        if (grades == null || grades.length == 0) {
            return 0;
        }

        int highest = grades[0];

        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }

        return highest;
    }

    public int getLowestGrade() {
        if (grades == null || grades.length == 0) {
            return 0;
        }

        int lowest = grades[0];

        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }

        return lowest;
    }
}
