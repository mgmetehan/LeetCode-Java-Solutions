import java.util.Stack;

public class ValidParentheses_20_Easy {
    //https://leetcode.com/problems/valid-parentheses/ ->problem
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Character ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (stack.empty()) {
                return false;
            } else if (ch == '}' && stack.pop() != '{') {
                return false;
            } else if (ch == ')' && stack.pop() != '(') {
                return false;
            } else if (ch == ']' && stack.pop() != '[') {
                return false;
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
}
/*
Stack Sınıfının Metotları
boolean empty()
 Yığıtın boş olup olmadığını söyler. Yığıt boşsa true değerini verir..
peek()
 Yığıtın en üstündeki öğeyi değer olarak alır; ama onu yığıttan almaz, yerinde bırakır.
pop()
 Yığıtın en üstündeki öğeyi değer olarak alır ve onu yığıttan siler.
push(E item)
 Verilen nesneyi yığıtın üstüne koyar.
 */
