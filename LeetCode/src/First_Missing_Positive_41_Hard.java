import java.util.Arrays;

public class First_Missing_Positive_41_Hard {
    public int firstMissingPositive(int[] nums) {
        // ignore non-positives and duplicates
        Arrays.sort(nums);
        var missingNumber = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || (i > 0 && nums[i] == nums[i - 1])) {
                continue;
            }
            if (nums[i] == missingNumber) {
                missingNumber++;
            } else {
                break;
            }
        }
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        var result = new First_Missing_Positive_41_Hard().firstMissingPositive(nums);
        System.out.println(result);
    }
}
