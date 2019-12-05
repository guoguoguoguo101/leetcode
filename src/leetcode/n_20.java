package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class n_20 {

    public boolean isValid(String s) {
        Map<Character,Character> m1 = new HashMap<Character,Character>();
        m1.put('(',')');
        m1.put('[',']');
        m1.put('{','}');
        System.out.println(m1);

        Stack<Character> stack = new Stack<>();
        System.out.println(stack+"---***");


        for (int i=0;i<s.length();i++){

            char c = s.charAt(i);

             if (m1.containsKey(c)){
                 stack.push(c);
             }else {
                 if (stack.empty())return false;
                 if (m1.containsValue(c)) {
                     char b = (char)m1.get(stack.pop());
                     if (b!=c){
                         return false;
                     }
                 }
             }
        }

        return stack.empty();
    }


    public static void main(String[] args) {
      boolean b= new n_20().isValid("(({)");
        System.out.println(b);

    }
}
