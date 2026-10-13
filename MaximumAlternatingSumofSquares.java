import java.util.*;
class MaximumAlternatingSumofSquares {
public long maxAlternatingSum(int[] nums) {
int n = nums.length;
    for (int i = 0; i < n; i++) {
        nums[i] = nums[i] * nums[i];
    }

    Arrays.sort(nums);

    long sum = 0;
    for (int i = 0; i < n; i++) {
        if (i < n / 2) {
            sum -= nums[i];
        } else {
            sum += nums[i];
        }
    }

    return sum;
}
public static void main(String[] args) {
    MaximumAlternatingSumofSquares obj = new MaximumAlternatingSumofSquares();
    int[] nums = {1, 2, 3};
    long result = obj.maxAlternatingSum(nums);
    
    // Print the result
    System.out.println(result); // Output: 14

}
