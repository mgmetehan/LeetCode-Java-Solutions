public class TwoSum_1_Easy {
    //https://leetcode.com/problems/two-sum/ ->Problem
    //O(n2)solution
    //Best solution https://tinyurl.com/2by4b499
    public static int[] twoSum(int[] nums, int target) {
        int[] sonuc = new int[2];
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (target == (nums[i] + nums[j])) {
                    sonuc = new int[2];
                    sonuc[0] = i;
                    sonuc[1] = j;
                    return sonuc;
                }
            }
        }
        return sonuc;
    }
}

