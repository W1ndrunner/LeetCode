
class Solution {
    public int pivotIndex(int[] nums) { // Inefficient.
        boolean exists = false;
        int[] leftsum = new int[nums.length]; //Creating arrays.
        int[] rightsum = new int[nums.length];
        int index = -1;
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i < nums.length; i++) { // Creates an array of sum of everything to left and right at each point
            if (i == 0) { // Makes starting leftsum and last rightsum 0
                leftsum[0] = 0;
                rightsum[(nums.length - 1)] = 0;
            } else {
                sum1 += nums[i-1];
                leftsum[i] = sum1;
                sum2 += nums[(nums.length-i)];
                rightsum[(nums.length - i - 1)] = sum2;
            }
        
        }
        for (int j = 0; j < nums.length; j++) { // Checks if corresponding element in each array are equal
            if (leftsum[j] == rightsum[j]){
                index = j;
                exists = true;
                break;
            }
        }
        if (exists = false) { // If no pivot index, output == -1
            index = -1;
        }
        return index;
    }
}