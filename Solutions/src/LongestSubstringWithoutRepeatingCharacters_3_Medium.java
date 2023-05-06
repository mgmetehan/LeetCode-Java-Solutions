import java.util.HashSet;
public class LongestSubstringWithoutRepeatingCharacters_3_Medium {
//https://leetcode.com/problems/longest-substring-without-repeating-characters/ ->Problem
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<Character>();
        int result = 0, i = 0, j = 0;
        while (i < s.length()) {
            if (!hashSet.contains(s.charAt(i))) {
                hashSet.add(s.charAt(i++));
                if (hashSet.size() >= result) {
                    result = hashSet.size();
                }
            } else {
                hashSet.remove(s.charAt(j++));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "dvdf";
        //abcabcbb//a//""//au//dvdf
        System.out.println(lengthOfLongestSubstring(s));
    }
}