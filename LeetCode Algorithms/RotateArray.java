public class RotateArray {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        System.out.println("We got: " + rotator(nums));
        
    }
    public static int[] rotate(int[] nums, int k){
       return new int[0];
    }
    public static int[] rotator(int[] num){
        int[] newnum = new int[num.length];
        int temp = num[num.length-1];
        for (int i = 0; i < num.length -2; i++){
            newnum[i+1] = num[i];
        }
        newnum[0] = temp;
        return newnum;
    }
    
}
