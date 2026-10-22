package semester1.practice06;

public class Task_22 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Тетяна";
        employee.baseSalary = 30000;
        employee.bonusPercentage = 15;

        System.out.println("Працівник: " + employee.name);
        System.out.println("Зарплата з бонусом: "
                + employee.calculateTotalSalary() + " грн");
        System.out.println("Податок: "
                + employee.calculateTax() + " грн");
    }
}

class Employee {
    String name;
    double baseSalary;
    double bonusPercentage;

    public double calculateTotalSalary() {
        return baseSalary * (1 + bonusPercentage / 100);
    }

    public double calculateTax() {
        return calculateTotalSalary() * 0.195;
    }
}