public class FirstBadVersion {
    public static void main(String[] args){
        
    }
    public int firstBadVersion(int n){
        boolean control = false;
        int x = n;
        int x2 = x/2;
        while (control = false){
            if (isBadVersion(x2) == true){
                x = x2;
                x2 = x/2;
                continue;
            } else{
                x2 = (x2 + x)/2;
            }
        }


    }
}
