public class FinancialForecasting {
    public static double futureValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return futureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }
    public static void main(String[] args) {
        double initial = 10000;      
        double growthRate = 0.10;   
        int years = 5;
        double forecast = futureValue(initial, growthRate, years);
        System.out.printf("Projected value after %d years: Rs %.2f\n", years, forecast);
    }
}
