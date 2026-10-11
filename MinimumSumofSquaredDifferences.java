class MinimumSumofSquaredDifferences{
    public static int minSumSquareDiff(int []arr){
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                sum+=arr[i]*arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // Your code here
        int []arr={1, 2, 3, 4, 5};
        int result = minSumSquareDiff(arr);
        System.out.println(result);
    }
}