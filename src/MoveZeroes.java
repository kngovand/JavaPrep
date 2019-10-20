public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int zeroCounter = 0;
        int realCounter = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroCounter++;
            }
            else if(nums[i] !=0) {
                nums[realCounter] = nums[i];
                realCounter++;
            }
        }

        for(int i = nums.length - zeroCounter; i < nums.length; i++) {
            nums[i] = 0;
        }

        for(int i : nums) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int[] nums = {1,3,0,13,0};
        moveZeroes(nums);
    }
}
