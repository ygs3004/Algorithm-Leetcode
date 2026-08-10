package ygs.leetcode.main.problem.backtracking.combinationSum;

import java.util.*;

public class Solution {

    static int[] candidates;
    static int target;
    static List<List<Integer>> answer;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        this.answer = new ArrayList<>();
        List<Integer> init = new ArrayList<Integer>();
        for(int i = 0; i < candidates.length; i++){
            init.add(candidates[i]);
            dfs(0, i, init);
            init.remove(0);
        }

        return answer;
    }

    private void dfs(int sum, int idx, List<Integer> list){
        int curCandidate = candidates[idx];
        sum += curCandidate;
        if(sum == target){
            answer.add(new ArrayList<>(list));
            return;
        }

        // 중복 조합을 피하기위해 현재 idx보다 높은 경우만 체크
        for(int i = idx; i < candidates.length; i++){
            int nextCandidate = candidates[i];
            if(nextCandidate + sum > target) continue;

            list.add(nextCandidate);
            int curListIdx = list.size() - 1;
            dfs(sum, i, list);
            list.remove(curListIdx);
        }
    }
}