import java.util.Scanner;
public class Main {
    public static int knapsackTabulation(int[] weight, int[] profit, int W, int n) {
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (weight[i - 1] <= w) {
                    dp[i][w] = Math.max(profit[i - 1] + dp[i - 1][w - weight[i - 1]], dp[i - 1][w] );
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        int[] profit = new int[n];
        int[] weight = new int[n];
        System.out.println("Enter the profits of the items:");
        for (int i = 0; i < n; i++) {
            profit[i] = sc.nextInt();
        }
        System.out.println("Enter the weights of the items:");
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }
        System.out.print("Enter the maximum capacity of the knapsack: ");
        int W = sc.nextInt();
        sc.close();
        int result = knapsackTabulation(weight, profit, W, n);
        System.out.println("Maximum profit (Tabulation): " + result);
    }
}
