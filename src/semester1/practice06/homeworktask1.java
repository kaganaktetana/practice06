package semester1.practice06;

public class homeworktask1 {
        public static void main(String[] args) {
            Fraction fraction = new Fraction();

            System.out.println("=== КАЛЬКУЛЯТОР ЗВИЧАЙНИХ ДРОБІВ ===");

            fraction.setValues(8, 12);

            System.out.print("Дріб 1: ");
            fraction.printFraction();

            fraction.simplify();

            System.out.print("Після скорочення: ");
            fraction.printFraction();

            System.out.printf("Десятковий вигляд: %.4f%n",
                    fraction.toDecimal());

            System.out.println("\nДодаємо дріб 3/4...");
            fraction.add(3, 4);

            System.out.print("Результат додавання: ");
            fraction.printFraction();

            System.out.printf("Десятковий вигляд: %.4f%n",
                    fraction.toDecimal());

            System.out.println("=====================================");
        }
    }

    class Fraction {
        private int numerator;
        private int denominator;

        public void setValues(int num, int den) {
            numerator = num;

            if (den == 0) {
                System.out.println(
                        "Помилка: знаменник не може дорівнювати 0!"
                );
                denominator = 1;
                return;
            }

            if (den < 0) {
                numerator = -num;
                denominator = -den;
            } else {
                denominator = den;
            }
        }

        private int gcd(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);

            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;
            }

            return a;
        }

        public void simplify() {
            int divisor = gcd(numerator, denominator);

            if (divisor != 0) {
                numerator = numerator / divisor;
                denominator = denominator / divisor;
            }
        }

        public double toDecimal() {
            return (double) numerator / denominator;
        }

        public void add(int otherNum, int otherDen) {
            if (otherDen == 0) {
                System.out.println(
                        "Помилка: знаменник не може дорівнювати 0!"
                );
                return;
            }

            numerator = numerator * otherDen
                    + otherNum * denominator;

            denominator = denominator * otherDen;

            if (denominator < 0) {
                numerator = -numerator;
                denominator = -denominator;
            }

            simplify();
        }

        public void printFraction() {
            if (denominator == 1) {
                System.out.println(numerator);
            } else {
                System.out.println(numerator + "/" + denominator);
            }
        }
    }

