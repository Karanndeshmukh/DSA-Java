package Arrays.Easy;
public class appearOnce {
    // Function to find the element that appears only once in an array where every other element appears twice
    public static int findSingle(int[] arr) {
        int result = 0;
        for (int i=0; i<arr.length; i++) {
            result ^= arr[i]; // XOR operation
        }
        return result;
    }
}
