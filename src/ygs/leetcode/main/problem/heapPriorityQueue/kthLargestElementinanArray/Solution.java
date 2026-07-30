package ygs.leetcode.main.problem.heapPriorityQueue.kthLargestElementinanArray;

import java.util.*;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            pq.add(num);
        }

        while (k-- > 1) {
            pq.poll();
        }

        return pq.poll();
    }
}