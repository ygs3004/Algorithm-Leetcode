package ygs.leetcode.main.problem.backtracking.permutaions;

import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(nums, list, answer, visited);

        return answer;
    }

    private void dfs(int[] nums, List<Integer> cur, List<List<Integer>> answer, boolean[] visited){
        if(cur.size() == nums.length){
            answer.add(new ArrayList<>(cur));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!visited[i]){
                visited[i] = true;
                cur.add(nums[i]);
                int removeIdx = cur.size() - 1;
                dfs(nums, cur, answer, visited);
                cur.remove(removeIdx);
                visited[i] = false;
            }
        }
    }
}