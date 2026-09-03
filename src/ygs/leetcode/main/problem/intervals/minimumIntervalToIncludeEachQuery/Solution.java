package ygs.leetcode.main.problem.intervals.minimumIntervalToIncludeEachQuery;

import java.util.*;

public class Solution {

    int[] sgTree;

    public int[] minInterval(int[][] intervals, int[] queries) {

        int min = 1;
        int max = 10_000_000;
        int treeSize = (max - min) * 4;
        sgTree = new int[treeSize];
        Arrays.fill(sgTree, max);
        for(int[] interval : intervals){
            int left = interval[0];
            int right = interval[1];
            int size = right - left + 1;
            updateTree(1, min, max, left, right, size);
        }

        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int size = queryTree(1, min, max, queries[i]);
            answer[i] = size == max ? -1 : size;
        }
        return answer;
    }

    private void updateTree(int index, int start, int end, int left, int right, int size){
        if(right < start || left > end){
            return;
        }

        if(start >= left && end <= right){
            sgTree[index] = Math.min(sgTree[index], size);
            return;
        }

        int mid = start + (end - start) / 2;
        updateTree(index * 2 ,start, mid, left, right, size);
        updateTree(index * 2 + 1, mid + 1, end, left, right, size);
    }

    private int queryTree(int index, int start, int end, int find){
        if((start == end)){
            return sgTree[index];
        }

        int result = sgTree[index];

        int mid = start + (end - start) / 2;
        if(mid >= find){
            result = Math.min(result, queryTree(index * 2, start, mid, find));
        }else{
            result = Math.min(result, queryTree(index * 2 + 1, mid + 1, end, find));
        }

        return result;
    }

}