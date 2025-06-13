import java.util.Scanner;
public class Main {
    public static boolean isSubsetSum(int[] arr, int n, int target) {
        if (target == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (arr[n - 1] > target) {
            return isSubsetSum(arr, n - 1, target);
        }
        return isSubsetSum(arr, n - 1, target) || isSubsetSum(arr, n - 1, target - arr[n - 1]);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        boolean result = isSubsetSum(arr, n, target);
        System.out.println("Subset with given sum exists: " + result);
        scanner.close();
    }
}
