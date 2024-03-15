import java.util.Scanner;
/**
 
 */
public class lloyd
{
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter total cost of merchandise: ");
        double merchandiseCost = scanner.nextDouble();

        System.out.print("Enter total salary expenses (including your own salary): ");
        double salaryExpenses = scanner.nextDouble();

        System.out.print("Enter yearly rent: ");
        double yearlyRent = scanner.nextDouble();

        System.out.print("Enter estimated electricity cost: ");
        double electricityCost = scanner.nextDouble();

        // Calculate total expenses
        double totalExpenses = merchandiseCost + salaryExpenses + yearlyRent + electricityCost;

        // Calculate desired net profit (10% of merchandise cost)
        double desiredNetProfit = 0.10 * merchandiseCost;

        // Calculate total revenue needed (including desired profit)
        double totalRevenueNeeded = totalExpenses + desiredNetProfit;

        // Calculate the effective discount due to the 15% sale
        double effectiveDiscount = 0.15;

        // Calculate the marked-up price
        double markedUpPrice = totalRevenueNeeded / (1 - effectiveDiscount);

        // Calculate the markup percentage
        double markupPercentage = (markedUpPrice - merchandiseCost) / merchandiseCost * 100;

        // Output the result
        System.out.println("To achieve  10% net profit on merchandise cost:");
        System.out.printf("Merchandise should be up by %.2f%%\n", markupPercentage);
        System.out.printf("Marked-up price: R%.2f\n", markedUpPrice);

        scanner.close();
    }
}