package semester1.practice06;

public class Task_16 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.model = "HP LaserJet";
        printer.paperCount = 20;

        printer.printDocument("Звіт", 5);
        printer.printDocument("Практична робота", 18);
    }
}

class Printer {
    String model;
    int paperCount;

    public void printDocument(String title, int pages) {
        if (paperCount >= pages) {
            paperCount -= pages;
            System.out.println("Документ \"" + title + "\" успішно надруковано.");
            System.out.println("Залишилося паперу: " + paperCount);
        } else {
            System.out.println("Помилка: Недостатньо паперу в принтері "
                    + model + "!");
        }
    }
}