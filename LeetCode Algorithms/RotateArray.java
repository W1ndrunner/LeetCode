public class RotateArray {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        System.out.println("We got: " + rotate(nums, 3));
    }
    public static int[] rotate(int[] nums, int k){
            int n = nums.length;
            int[] result = new int[n];
            int[] temp = nums;
            for (int i = k; i > 0; i--){
                result[0] = temp[n-1];
                for (int j = 1; j < n; j++){
                    result[j] = temp[j-1];
                }
                temp = result;

            }
            return result;
    }
    
}
