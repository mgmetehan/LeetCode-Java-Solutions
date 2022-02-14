import java.util.HashSet;

public class SingleNumber_136_Easy {
    //https://leetcode.com/problems/single-number/ ->problem
    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0, a; i < nums.length; i++) {
            a = nums[i];
            if (set.contains(a)) {
                set.remove(a);
            } else {
                set.add(a);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(singleNumber(nums));
    }
}
/*
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }
        int a;
        for (int i = 0; i < arr.size(); i++) {
            a = arr.get(i);
            arr.remove(i);
            if (arr.contains(a)) {
                i--;
                arr.add(a);
            } else {
                return a;
            }
        }
        return 0;
 */
