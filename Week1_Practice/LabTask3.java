
public class LabTask3 {
    public static void main(String[] args) {
        
            double amount = 1000.0;
            double profitRate = 0.05;
            int years = 10;

            // Assigning a variable to the current amount
            double currentAmount = amount;

            System.out.printf("%-10s %-20s%n", "Year", "Amount on Deposit");
            for (int year = 1; year <= years; year++) {
                double profit = currentAmount * profitRate;

                currentAmount += profit;

                System.out.printf("  %d            $%.2f%n", year, currentAmount);
            }

        
    }
}
