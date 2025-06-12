import java.util.HashMap;
import java.util.Scanner;
public class Main {
    private HashMap<Integer, Integer> memo = new HashMap<>();

    public Main() {
        memo.put(0, 0);
        memo.put(1, 1);
    }
    public int fibmemo(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = fibmemo(n - 1) + fibmemo(n - 2);
        memo.put(n, result);
        return result;
    }
    public static void main(String[] args) {
        Main fibonacci = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            System.out.println("Fibonacci of " + n + " is: " + fibonacci.fibmemo(n));
        }
        scanner.close();
    }
}
