package semester1.practice06;

public class Task_05 {
    public static void main(String[] args) {
        Product product = new Product();

        product.name = "Монітор";
        product.price = 6500.0;
        product.quantity = 8;

        double total = product.price * product.quantity;

        System.out.println("Товар: " + product.name);
        System.out.println("Загальна вартість: " + total + " грн");
    }
}

class Product {
    public String name;
    public double price;
    public int quantity;
}