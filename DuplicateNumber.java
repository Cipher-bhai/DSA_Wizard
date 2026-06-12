

public class DuplicateNumber {

    public static boolean containDuplicate(int[] nums) {
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = {1,4,6,3,6,7};

        System.out.println(containDuplicate(num));
    }
}