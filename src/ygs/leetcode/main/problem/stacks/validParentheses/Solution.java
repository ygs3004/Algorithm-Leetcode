package ygs.leetcode.main.problem.stacks.validParentheses;

import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            while(true){
                if(stack.isEmpty() || !isPair(stack.peekLast(), c)){
                    stack.offerLast(c);
                    break;
                }else {
                    stack.pollLast();
                    if(stack.isEmpty()){
                        break;
                    }else{
                        c = stack.pollLast();
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    public boolean isPair(char a, char b){
        return (a =='(' && b ==')')
                || (a =='{' && b =='}')
                || (a =='[' && b ==']');
    }
}