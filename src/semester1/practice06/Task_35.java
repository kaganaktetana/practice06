package semester1.practice06;

public class Task_35 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(250);
        cart.addItem(400);
        cart.addItem(150);

        System.out.println("Чек до знижки:");
        System.out.println("До сплати: " + cart.getTotalCost() + " грн");

        cart.applyDiscount(15);

        System.out.println("Чек після знижки 15%:");
        System.out.println("До сплати: " + cart.getTotalCost() + " грн");
    }
}

class ShoppingCart {
    private double[] itemPrices = new double[10];
    private int count = 0;

    public void addItem(double price) {
        if (price <= 0) {
            System.out.println("Ціна має бути більшою за 0.");
            return;
        }

        if (count < itemPrices.length) {
            itemPrices[count] = price;
            count++;
        } else {
            System.out.println("Кошик заповнений.");
        }
    }

    public double getTotalCost() {
        double total = 0;

        for (int i = 0; i < count; i++) {
            total += itemPrices[i];
        }

        return total;
    }

    public void applyDiscount(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Некоректний відсоток знижки.");
            return;
        }

        for (int i = 0; i < count; i++) {
            itemPrices[i] = itemPrices[i] * (1 - percent / 100);
        }
    }
}