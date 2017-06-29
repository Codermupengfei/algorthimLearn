import java.util.Stack;

/**
 * Created by OovEver on 2017/6/28.
 * 用栈解决
 */
public class LeetCode20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                char c = stack.peek();
                stack.pop();
                char match;
                if (s.charAt(i) == ')') {
                    match = '(';
                } else if (s.charAt(i) == ']') {
                    match = '[';
                } else {
                    match = '{';
                }
                if (c != match) {
                    return false;
                }
            }
        }
        if(stack.size()!=0)
        return false;
        return true;

    }
}
