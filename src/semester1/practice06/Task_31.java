package semester1.practice06;

public class Task_31 {
    public static void main(String[] args) {
        DiscountCard card = new DiscountCard("Тетяна");

        card.addPurchase(3000);
        card.printCardInfo();

        card.addPurchase(4000);
        card.printCardInfo();
    }
}

class DiscountCard {
    private String ownerName;
    private double totalSpent;
    private int discountPercent = 1;

    public DiscountCard(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addPurchase(double cost) {
        if (cost <= 0) {
            System.out.println("Сума покупки має бути більшою за 0.");
            return;
        }

        totalSpent += cost;

        if (totalSpent >= 10000) {
            discountPercent = 10;
        } else if (totalSpent >= 5000) {
            discountPercent = 5;
        } else {
            discountPercent = 1;
        }
    }

    public void printCardInfo() {
        System.out.println("Власник картки: " + ownerName);
        System.out.println("Витрачено всього: " + totalSpent + " грн");
        System.out.println("Знижка: " + discountPercent + "%");
        System.out.println("----------------------");
    }
}