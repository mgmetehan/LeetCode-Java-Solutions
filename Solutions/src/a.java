
public class  {

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
