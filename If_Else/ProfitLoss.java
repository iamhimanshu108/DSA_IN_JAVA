import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Cost Price");
        int cost = sc.nextInt();

        System.out.println("Enter Your Selling Price");
        int selling = sc.nextInt();

        if (selling > cost) {
            int profit = selling - cost;
            double profitPercent = (profit * 100.0) / cost;
            System.out.println("Profit " + profit);
            System.out.printf("Profit Percentage: %.2f%%\n", profitPercent);
        } else if (selling < cost) {
            int loss = cost - selling;
            double lossPercent = (loss * 100.0) / cost;
            System.out.println("Loss " + loss);
            System.out.printf("Loss Percentage: %.2f%%\n", lossPercent);
        } else {
            System.out.println("No profit No Loss");
        }
        
    }
}
