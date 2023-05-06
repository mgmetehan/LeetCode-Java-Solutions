
public class  MaxConsecutiveOnes_485_Easy{
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        MaxConsecutiveOnes_485_Easy mco = new MaxConsecutiveOnes_485_Easy();
        System.out.println(mco.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                maxCount = Math.max(maxCount, count);
                count = 0;
            } else {
                count++;
            }
        }

        return Math.max(maxCount, count);
    }
}
