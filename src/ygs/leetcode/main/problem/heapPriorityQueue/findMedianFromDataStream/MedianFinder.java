package ygs.leetcode.main.problem.heapPriorityQueue.findMedianFromDataStream;

import java.util.*;

class MedianFinder {

    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianFinder() {
        left = new PriorityQueue<>((a,b) -> Integer.compare(b, a));
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if(left.isEmpty()){
            left.add(num);
        }else if(left.peek() > num){
            left.add(num);
        }else{
            right.add(num);
        }

        while(right.size() > left.size()){
            left.add(right.poll());
        }

        while(left.size() > right.size() + 1){
            right.add(left.poll());
        }
    }

    public double findMedian() {

        double median = 0;
        int size = left.size() + right.size();

        if(size == 0){
            return median;
        }else if(size % 2 == 0){
            median = (double)(left.peek() + right.peek())/2;
        }else{
            median = left.peek();
        }

        return median;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */