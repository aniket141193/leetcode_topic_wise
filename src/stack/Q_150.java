package stack;

import java.util.Stack;

public class Q_150 {

    public static void main(String[] args) {
        System.out.print(evalRPN(new String[]{ "2","1","+","3","*"}));
    }

    private static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token: tokens) {
            if("+".equals(token)){
                int no2 = stack.pop();
                int no1 = stack.pop();
                int res =no1  + no2;
                stack.push(res);
            }else if("-".equals(token)){
                int no2 = stack.pop();
                int no1 = stack.pop();
                int res =no1  - no2;
                stack.push(res);
            }else if("*".equals(token)){
                int no2 = stack.pop();
                int no1 = stack.pop();
                int res =no1  * no2;
                stack.push(res);
            }else if("/".equals(token)){
                int no2 = stack.pop();
                int no1 = stack.pop();
                int res =no1  / no2;
                stack.push(res);
            }else{
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.peek();
    }
}
