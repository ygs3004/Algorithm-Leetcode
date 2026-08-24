package ygs.leetcode.main.problem.stacks.largestRectangleInHistogram;

import java.util.*;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.addLast(heights[0]);

        int width;
        for(int i = 1; i < heights.length; i++){
            int h1 = heights[i];
            width = 1;
            while(!stack.isEmpty() && stack.peekLast() > h1){
                int h2 = stack.pollLast();
                answer = Math.max(h2 * width, answer);
                width++;
            }

            while(width-- > 0){
                stack.addLast(h1);
            }
        }

        width = 1;
        while(!stack.isEmpty()){
            int h2 = stack.pollLast();
            answer = Math.max(h2 * width, answer);
            width++;
        }

        return answer;
    }
}