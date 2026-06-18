package BinarySearch;

public class NumberOccurence {
    public int LowerBound(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = arr.length;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public int UpperBound(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = arr.length;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= target) {
                s = mid + 1;
            } else {
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }

    public int count(int[] arr, int target) {
        int lb = LowerBound(arr, target);
        int ub = UpperBound(arr, target);
        return ub - lb;
    }

    // Main method added here
    public static void main(String[] args) {
        NumberOccurence solver = new NumberOccurence();
        
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        
        // Test Case 1: Target exists multiple times
        int target1 = 2;
        System.out.println("Occurrences of " + target1 + ": " + solver.count(arr, target1)); // Output: 4
        
        // Test Case 2: Target does not exist
        int target2 = 4;
        System.out.println("Occurrences of " + target2 + ": " + solver.count(arr, target2)); // Output: 0
    }
}