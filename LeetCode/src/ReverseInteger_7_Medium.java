public class ReverseInteger_7_Medium {
    //https://leetcode.com/problems/reverse-integer/ ->Problem
    public static int reverse(int x) {
        long reverseX = 0;
        while (0 != x) {
            reverseX = reverseX * 10 + x % 10;
            x = x / 10;
        }
        if (reverseX >= Integer.MIN_VALUE && reverseX <= Integer.MAX_VALUE) {
            return (int) reverseX;
        } else return 0;
    }


    public static void main(String[] args) {
        // 1534236469 sonuç=0    -2147483412 sonuç=0
        System.out.println(reverse(-1230));
    }

}
      /*
        long reverseX = 0;
        int y = x, i = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (0 > x) x *= -1;
        while (0 < x) {
            arrayList.add(x % 10);
            x = x / 10;
        }
        while (i < arrayList.size()) {
            reverseX *= 10;
            reverseX += arrayList.get(i);
            i++;
        }
        if (y < 0) reverseX *= -1;
        if (reverseX >= Integer.MIN_VALUE && reverseX <= Integer.MAX_VALUE) {
            return (int) reverseX;
        } else return 0;
         */