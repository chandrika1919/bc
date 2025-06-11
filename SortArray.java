import java.util.Scanner;
class Main {
    public int[] sortArray(int[] nums) {
        quick(nums, 0, nums.length - 1);
        return nums;
    }
    private void quick(int[] nums, int low, int high) {
        if (low >= high) return;
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];
        while (start <= end) {
            while (nums[start] < pivot) start++;
            while (nums[end] > pivot) end--;
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        quick(nums, low, end);
        quick(nums, start, high);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Main solution = new Main();
        int[] sorted = solution.sortArray(nums);
        System.out.println("Sorted array:");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
