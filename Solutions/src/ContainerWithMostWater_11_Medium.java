public class ContainerWithMostWater_11_Medium {
    //https://leetcode.com/problems/container-with-most-water/ ->Problem
    public static int maxArea(int[] height) {
        int result = 0, maxResult = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            if (height[i] <= height[j]) {
                result = height[i] * (j - i);
                i++;
            } else {
                result = height[j] * (j - i);
                j--;
            }
            maxResult = Math.max(result, maxResult);
        }
        return maxResult;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        //{1, 8, 6, 2, 5, 4, 8, 3, 7}  {1,1}

        System.out.println(maxArea(height));
    }
}
