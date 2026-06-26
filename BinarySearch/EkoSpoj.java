package BinarySearch;
public class EkoSpoj {
    public static void main(String[] args) {
        // Example usage of the EkoSpoj class
        int[] arr = {4, 42, 40, 26, 46};
        int target = 20;
        int result = findMaxHeight(arr, target);
        System.out.println("Maximum height to cut the trees: " + result);
    }

    public static int findMaxHeight(int[] arr, int target) {
        int s = 0;
        int e = getMax(arr);
        int ans = 0;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (canCut(arr, mid, target)) {
                ans = mid; // Update answer
                s = mid + 1; // Try for a higher cut
            } else {
                e = mid - 1; // Try for a lower cut
            }
        }
        return ans;
    }

    private static boolean canCut(int[] arr, int height, int target) {
        long totalCut = 0;
        for (int tree : arr) {
            if (tree > height) {
                totalCut += (tree - height);
            }
        }
        return totalCut >= target;
    }

    private static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}