public class SquaresOfSortedArray {
    public static void main(String[] args){

    }
    public int[] sortedSquares(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        int i = 0;
        int j = n-1;
        for (int p = n-1; p >= 0; p --){
            if (Math.abs(nums[i]) > Maths.abs(nums[j])){
                result[p] = nums[i] * nums[i];
                i++;
            } else{
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;

    }
}
