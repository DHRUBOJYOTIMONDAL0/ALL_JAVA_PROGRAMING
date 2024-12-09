public class array {

    public static void main(String[] args) {
        //int nums [] = {3,7,2,4};
        int nums [] = new int[4];
        nums[0] = 4;  // index starts from 0
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        //System.out.println(nums[1]);

    }
    
}
