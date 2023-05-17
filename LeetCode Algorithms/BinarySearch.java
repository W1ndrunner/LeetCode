public class BinarySearch{
    public static void main(String[] args){
        int[] some = {1,2,5,8,9,10,12};
        System.out.println(some.length);
        System.out.println("We got: " + search(some, 10));
    }
    public static int search(int[] nums, int target){
        int x = 0;
        int low = 0;
        int high = nums.length - 1;
        boolean control = false;
        while (control == false){
            x = (high+low)/2;
            if (high < low){
                return -1;
            }
            if (nums[x] < target){
                low = x + 1;
                continue;
            }
            else if (nums[x] > target){
                high = x-1;
                continue;
            }
            else{
                return x;
            }
        }
        return -1;
    }
}