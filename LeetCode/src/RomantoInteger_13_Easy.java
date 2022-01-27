import java.util.HashMap;

public class RomantoInteger_13_Easy {
    //https://leetcode.com/problems/roman-to-integer/ ->Problem
    public static int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            Character c = s.charAt(i);
            if (i != 0 && hashMap.get(c) > hashMap.get(s.charAt(i - 1))) {
                Character ch = s.charAt(i - 1);
                result += hashMap.get(c) - hashMap.get(ch);
                i--;
            } else {
                result += hashMap.get(c);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //III->3    LVIII->58   MCMXCIV->1994
        System.out.println(romanToInt("III"));

    }
}
/*Aynı kod sadece if şekli farklı
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            Character c = s.charAt(i);
            if (i != 0) {
                Character ch = s.charAt(i - 1);
                if (hashMap.get(c) > hashMap.get(ch)) {
                    result += hashMap.get(c) - hashMap.get(ch);
                    i--;
                } else {
                    result += hashMap.get(c);
                }
            } else {
                result += hashMap.get(c);
            }
        }
        return result;
 */
