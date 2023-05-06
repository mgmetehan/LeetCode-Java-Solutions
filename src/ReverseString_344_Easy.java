public class ReverseString_344_Easy {
    //https://leetcode.com/problems/reverse-string/ ->Problem
    public static void reverseString(char[] s) {
        char sReverse;
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            sReverse = s[i];
            s[i] = s[j];
            s[j] = sReverse;
        }
    }

}
/*
    String fullS="";
    for (int i = 0; i < s.length;i++){
        fullS+=s[i];
    }
    for (int i = 0,j = s.length-1; i < s.length;i++,j--){
    s[i]=fullS.charAt(j);
    }
 */