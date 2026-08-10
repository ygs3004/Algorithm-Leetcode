package ygs.leetcode.main.problem.backtracking.combinationSum;

import java.util.*;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{new int[]{2, 3, 6, 7}, 7});
        testCase.put("2", new Object[]{new int[]{2, 3, 5}, 8});
        testCase.put("3", new Object[]{new int[]{2}, 1});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        List<List<Integer>> answer1 = new ArrayList<>();
        List<Integer> answer1_1 = Arrays.asList(new Integer[]{2, 2, 3});
        List<Integer> answer1_2 = Arrays.asList(new Integer[]{7});
        answer1.add(answer1_1);
        answer1.add(answer1_2);

        List<List<Integer>> answer2 = new ArrayList<>();
        List<Integer> answer2_1 = Arrays.asList(new Integer[]{2, 2, 2, 2});
        List<Integer> answer2_2 = Arrays.asList(new Integer[]{2,3,3});
        List<Integer> answer2_3 = Arrays.asList(new Integer[]{3,5});
        answer2.add(answer2_1);
        answer2.add(answer2_2);
        answer2.add(answer2_3);

        List<List<Integer>> answer3 = new ArrayList<>();

        resultCase.put("1", answer1);
        resultCase.put("2", answer2);
        resultCase.put("3", answer3);
        return resultCase;
    }

}
