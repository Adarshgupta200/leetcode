
import java.util.*;

class Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for non-val elements
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place non-val element at k
                k++;
            }
        }
        
        return k; // Return count of elements not equal to val
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int k = removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
