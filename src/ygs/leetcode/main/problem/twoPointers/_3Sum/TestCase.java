package ygs.leetcode.main.problem.twoPointers._3Sum;

import java.util.*;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{new int[]{-1,0,1,2,-1,4}});
        testCase.put("2", new Object[]{new int[]{0,1,1}});
        testCase.put("3", new Object[]{new int[]{0,0,0}});

        return testCase;
    }

    public HashMap<String, List<List<Integer>>> getResult(){
        HashMap<String, List<List<Integer>>> resultCase = new HashMap<>();
        List<List<Integer>> answer1 = new ArrayList<>();
        List<Integer> answer1_1 = Arrays.asList(new Integer[]{-1, -1, 2});
        List<Integer> answer1_2 = Arrays.asList(new Integer[]{-1, 0, 1});
        answer1.add(answer1_1);
        answer1.add(answer1_2);
        List<List<Integer>> answer2 = new ArrayList<>();
        List<List<Integer>> answer3 = new ArrayList<>();
        List<Integer> answer3_1 = Arrays.asList(new Integer[]{0,0,0});
        answer3.add(answer3_1);

        resultCase.put("1", answer1);
        resultCase.put("2", answer2);
        resultCase.put("3", answer3);
        return resultCase;
    }

}
