

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int answer[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) { // Loops through and adds running sum to array.
            sum += nums[i];
            answer[i] = sum;
        }

        return answer;
    }
}