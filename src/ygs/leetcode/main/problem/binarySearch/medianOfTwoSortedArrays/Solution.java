package ygs.leetcode.main.problem.binarySearch.medianOfTwoSortedArrays;

import java.util.*;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        Median med = new Median();

        for(int num: nums1){
            med.addNum(num);
        }

        for(int num: nums2){
            med.addNum(num);
        }

        return med.calcMedian();
    }

    private static class Median{

        PriorityQueue<Integer> left = new PriorityQueue<>((a,b) -> Integer.compare(b,a));
        PriorityQueue<Integer> right = new PriorityQueue<>();

        private void addNum(int n){
            if(left.isEmpty()){
                left.add(n);
            }else if(left.peek() > n){
                left.add(n);
            }else{
                right.add(n);
            }

            while(right.size() > left.size()){
                left.add(right.poll());
            }

            while(left.size() > right.size() + 1 ){
                right.add(left.poll());
            }
        }

        private double calcMedian(){
            if((left.size() + right.size()) % 2 == 1){
                return left.peek();
            }else{
                return (double)(left.peek() + right.peek()) / 2;
            }
        }
    }
}