package ygs.leetcode.main.problem.stacks.minStack;

import java.util.*;

class MinStack {

    int[] arr;
    int[] min;
    int curSize;

    public MinStack() {
        arr = new int[3 * (int)Math.pow(10, 4)];
        min = new int[3 * (int)Math.pow(10, 4)];
        Arrays.fill(min, Integer.MAX_VALUE);
        curSize = 0;
    }

    public void push(int value) {
        arr[curSize] = value;
        int minIdx = curSize;
        for(int i = 0; i < curSize; i++){
            if(value < min[i]){
                minIdx = i;
                break;
            }
        }

        for(int i = curSize; i >= minIdx + 1; i--){
            min[i] = min[i - 1];
        }

        min[minIdx] = value;

        curSize++;
    }

    public void pop() {
        curSize--;

        int value = arr[curSize];
        int minIdx = curSize;
        for(int i = 0; i <= curSize; i++){
            if(value == min[i]){
                minIdx = i;
                break;
            }
        }

        for(int i = minIdx; i < curSize; i++){
            min[i] = min[i + 1];
        }

    }

    public int top() {
        return arr[curSize - 1];
    }

    public int getMin() {
        return min[0];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */