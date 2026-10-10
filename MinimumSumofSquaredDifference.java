class MinimumSumofSquaredDifference {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int a = nums1.length;
        int b = 0;
        int[] c = new int[100005];
        
        for (int i = 0; i < a; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            c[d]++;
            if (d > b) {
                b = d;
            }
        }
        
        long e = (long) k1 + k2;
        
        for (int i = b; i > 0; i--) {
            if (c[i] == 0) continue;
            
            if (e >= c[i]) {
                e -= c[i];
                c[i - 1] += c[i];
                c[i] = 0;
            } else {
                c[i] -= (int) e;
                c[i - 1] += (int) e;
                e = 0;
                break;
            }
        }
        
        long f = 0;
        for (int i = 0; i <= b; i++) {
            if (c[i] > 0) {
                f += (long) c[i] * i * i;
            }
        }
        
        return f;
    }
    public static void main(String[] args) {
        MinimumSumofSquaredDifference obj = new MinimumSumofSquaredDifference();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        int k1 = 1;
        int k2 = 1;
        long result = obj.minSumSquareDiff(nums1, nums2, k1, k2);
        
        // Print the result
        System.out.println(result); // Output: 14
    }
}