package ygs.leetcode.main.problem.stacks.dailyTemperatures;

import java.util.*;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] answer = new int[temperatures.length];
        Deque<IdxTemp> stack = new ArrayDeque<>();

        for(int i = 0; i < temperatures.length; i++){
            int curTemp = temperatures[i];

            // 현재보다 낮은 온도의 이전의 값들을 제거하며 답에 저장
            while(!stack.isEmpty() && stack.peekLast().temp < curTemp){
                IdxTemp lowTemp = stack.pollLast();
                answer[lowTemp.idx] = i - lowTemp.idx;
            }

            stack.addLast(new IdxTemp(i, curTemp));
        }
        return answer;
    }

    private static class IdxTemp{
        int idx;
        int temp;

        IdxTemp(int idx, int temp){
            this.idx = idx;
            this.temp = temp;
        }
    }
}