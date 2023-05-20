public class SearchInsertPosition {
    public static void main(String[] args){
        int x = 3;
        System.out.println("We got: " + x/2);

    }
    public int searchInsert(int[] nums, int target){
        int x = 0;
        int low = 0;
        int high = nums.length - 1;
        boolean control = false;
        while (control == false){
            x = (high+low)/2;
            if (high < low){
                return low;
            }
            if (nums[x] < target){
                low = x + 1;
                continue;
            }
            else if (nums[x] > target){
                high = x - 1;
                continue;
            }
            else{
                return x;
            }
        }
        return low;

    }
}
