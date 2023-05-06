import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfaPhoneNumber_17_Medium {

    static HashMap<Integer, String> map;
    private static void solve(int i, String s, String digits, List<String> list) {
        if (i == digits.length()) {
            list.add(s);
            return;
        }

        int digit = (digits.charAt(i)) - '0';
        String values = map.get(digit);
        for (int j = 0; j < values.length(); j++) {
            solve(i + 1, s + values.charAt(j), digits, list);
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        solve(0, "", digits, result);
        return result;
    }


    public static void main(String[] args) {
        String s = "234";
        System.out.println(letterCombinations(s));

    }
}
/*
 public static List<String> letterCombinations(String digits) {
        HashMap<Character, String> letters = new HashMap<Character, String>();
        ArrayList<String> result = new ArrayList<String>();
        if (digits.length() == 0) {
            return (List<String>) result;
        }
        letters.put('2', "abc");
        letters.put('3', "def");
        letters.put('4', "ghi");
        letters.put('5', "jkl");
        letters.put('6', "mno");
        letters.put('7', "pqrs");
        letters.put('8', "tuv");
        letters.put('9', "wxyz");

        char sayi1, sayi2 = 0, sayi3 = 0, sayi4 = 0;
        sayi1 = digits.charAt(0);
        String arr1 = letters.get(sayi1);

        if (digits.length() == 1) {
            for (int i = 0; i < arr1.length(); i++) {
                result.add(arr1.charAt(i) + "");
            }
        } else if (digits.length() == 2) {
            sayi2 = digits.charAt(1);
            String arr2 = letters.get(sayi2);
            for (int i = 0; i < arr1.length(); i++) {
                for (int j = 0; j < arr2.length(); j++) {
                    result.add(arr1.charAt(i) + "" + arr2.charAt(j));
                }
            }
        } else if (digits.length() == 3) {
            sayi2 = digits.charAt(1);
            String arr2 = letters.get(sayi2);
            sayi3 = digits.charAt(2);
            String arr3 = letters.get(sayi3);

            for (int i = 0; i < arr1.length(); i++) {
                for (int j = 0; j < arr2.length(); j++) {
                    for (int k = 0; k < arr3.length(); k++) {
                        result.add(arr1.charAt(i) + "" + arr2.charAt(j) + "" + arr3.charAt(k));
                    }
                }
            }
        } else if (digits.length() == 4) {
            sayi2 = digits.charAt(1);
            String arr2 = letters.get(sayi2);
            sayi3 = digits.charAt(2);
            String arr3 = letters.get(sayi3);
            sayi4 = digits.charAt(3);
            String arr4 = letters.get(sayi4);

            for (int i = 0; i < arr1.length(); i++) {
                for (int j = 0; j < arr2.length(); j++) {
                    for (int k = 0; k < arr3.length(); k++) {
                        for (int m = 0; m < arr4.length(); m++) {
                            result.add(arr1.charAt(i) + "" + arr2.charAt(j) + "" + arr3.charAt(k) + "" + arr4.charAt(m));
                        }
                    }
                }
            }

        }
        return (List<String>) result;
    }

 */