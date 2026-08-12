package ygs.leetcode.main.problem.advancedGraphs.minCosttoConnectAllPoints;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();

        int[][] points1 = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        int[][] points2 = {{3, 12}, {-2, 5}, {-4, 1}};

        testCase.put("1", new Object[]{points1});
        testCase.put("2", new Object[]{points2});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 20);
        resultCase.put("2", 18);
        return resultCase;
    }

}
