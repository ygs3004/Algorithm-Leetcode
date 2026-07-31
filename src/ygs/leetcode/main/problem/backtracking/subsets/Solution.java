package ygs.leetcode.main.problem.backtracking.subsets;

import java.util.*;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(answer, cur, -1, visited, nums);

        return answer;
    }

    private void dfs(List<List<Integer>> answer, List<Integer> cur, int curidx, boolean[] visited, int[] nums){
        // Array 의 값을 복사하여 넣어준다.
        List<Integer> subset = new ArrayList<>(cur);
        answer.add(subset);

        for(int i = curidx + 1; i < visited.length; i++){
            if(!visited[i]){
                cur.add(nums[i]);
                int curSize = cur.size();
                visited[i] = true;
                dfs(answer, cur, i, visited, nums);
                // 값을 다시 초기화하여 백트래킹 한다.
                visited[i] = false;
                cur.remove(curSize - 1);
            }
        }
    }
}