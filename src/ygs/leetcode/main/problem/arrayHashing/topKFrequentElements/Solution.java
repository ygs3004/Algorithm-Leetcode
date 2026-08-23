package ygs.leetcode.main.problem.arrayHashing.topKFrequentElements;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Element> map = new HashMap<>();

        for(int num: nums){
            map.compute(num, (key, element) -> {
                if(element == null){
                    element = new Element(num);
                }else{
                    element.freq++;
                }
                return element;
            });
        }

        PriorityQueue<Element> pq = new PriorityQueue<>();
        for(Element e : map.values()){
            pq.add(e);
        }

        int[] answer = new int[k];
        for(int i = 0; i < k; i++){
            answer[i] = pq.poll().value;
        }

        return answer;
    }

    private static class Element implements Comparable<Element>{
        int value;
        int freq;

        Element(int value){
            this.value = value;
            this.freq = 1;
        }

        @Override
        public int compareTo(Element o){
            return o.freq - this.freq;
        }
    }
}