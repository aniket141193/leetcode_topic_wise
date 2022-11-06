package stack;

import java.util.Stack;

// https://leetcode.com/problems/longest-valid-parentheses/
public class Q_32 {

    public static void main(String[] args) {

    System.out.print(longestValidParentheses(")()())"));
    }


    private static int longestValidParentheses(String s) {
        int max = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(!stack.isEmpty()){
                    max = Math.max(max,i-stack.peek());
                }else{
                    stack.push(i);
                }
            }
        }

        return max;
    }
}
