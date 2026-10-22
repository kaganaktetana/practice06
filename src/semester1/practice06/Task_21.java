package semester1.practice06;

public class Task_21 {
    public static void main(String[] args) {
        CurrencyExchange exchange = new CurrencyExchange();

        exchange.usdRate = 41.5;

        double dollars = exchange.toUSD(10000);

        System.out.printf("10000 грн = %.2f доларів%n", dollars);
    }
}

class CurrencyExchange {
    double usdRate;

    public double toUSD(double uah) {
        return uah / usdRate;
    }

    public double toUAH(double usd) {
        return usd * usdRate;
    }
}