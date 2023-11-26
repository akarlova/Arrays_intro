package app;


public class Main {

    static double averagePrice;

    public static void main(String[] args) {

        double[] prices = new double[]{32.50, 47.20, 15.65, 30.75, 10.30,
                75.00, 48.35};

        for (int i = 0; i < prices.length; i++) {
            for (int j = 1; j < prices.length - i; j++) {
                if (prices[j - 1] > prices[j]) {
                    double temp = prices[j - 1];
                    prices[j - 1] = prices[j];
                    prices[j] = temp;
                }
            }
        }
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
            System.out.print(prices[i] + " ");
        }
        averagePrice = sum / prices.length;
        System.out.printf("%nAverage price is %.2f USD", averagePrice);
    }
}