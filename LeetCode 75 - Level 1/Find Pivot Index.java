
class Solution {
    public int pivotIndex(int[] nums) {
        boolean exists = false;
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int index = -1;
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i < nums.length; i++) {
            if (i == 0) {
                leftsum[0] = 0;
                rightsum[(nums.length - 1)] = 0;
            } else {
                sum1 += nums[i-1];
                leftsum[i] = sum1;
                sum2 += nums[(nums.length-i)];
                rightsum[(nums.length - i - 1)] = sum2;
            }
        
        }
        for (int j = 0; j < nums.length; j++) {
            if (leftsum[j] == rightsum[j]){
                index = j;
                exists = true;
                break;
            }
        }
        if (exists = false) {
            index = -1;
        }
        return index;
    }
}