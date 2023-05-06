public class PalindromeNumber_9_Easy {
    //https://leetcode.com/problems/palindrome-number/ ->Problem
    public static boolean isPalindrome(int x) {
        int xReverse = 0, y = x;
        if (y < 0) {
            return false;
        }
        while (x != 0) {
            xReverse = (xReverse * 10) + (x % 10);
            x /= 10;
        }
        if (y == xReverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}

