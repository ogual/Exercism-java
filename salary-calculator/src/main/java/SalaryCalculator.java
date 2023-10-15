public class SalaryCalculator {
    private static final double BASE_SALARY = 1000.0;
    private static final double MAX_SALARY = 2000.0;

    public double multiplierPerDaysSkipped(int daysSkipped) {
        return (daysSkipped > 5) ? 0.85 : 1.0;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return (productsSold > 20) ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * this.multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary = BASE_SALARY * this.multiplierPerDaysSkipped(daysSkipped) + this.bonusForProductSold(productsSold);

        return Math.min(MAX_SALARY, finalSalary);
    } 
}
