package HWs.hw9;

import java.util.Stack;

public class Level1 {
    //TODO:
    //    Последовательность ([{}]) является правильной, а последовательности ([)], {()] правильными не являются.
    //    Докажите это используя стек!
    public static void main(String[] args) {
        String s1 = "([{}])";
        String s2 = "([)]";
        String s3 = ")(";

        System.out.println(checkSequence(s1)); //true
        System.out.println(checkSequence(s2)); //false
        System.out.println(checkSequence(s3)); //false


    }

    public static boolean checkSequence(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        if (chars[0] == ')' || chars[0] == '}' || chars[0] == ']' || chars.length % 2 !=0){
            return false;
        }
        for (char aChar : chars) {
            if (aChar == '(' || aChar == '{' || aChar == '[') {
                stack.push(aChar);
            } else if ((aChar == ')' && stack.peek().equals('(')) || (aChar == ']' && stack.peek().equals('[')) ||
                    (aChar == '}' && stack.peek().equals('{'))) {
                stack.pop();
            }

        }
        return stack.isEmpty();

    }
}
