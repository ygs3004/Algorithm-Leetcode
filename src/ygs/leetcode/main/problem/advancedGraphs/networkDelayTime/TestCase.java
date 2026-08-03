package ygs.leetcode.main.problem.advancedGraphs.networkDelayTime;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();

        int[][] times1 = {{2, 1, 1},{2, 3, 1}, {3, 4, 1}};
        int[][] times2 = {{1, 2, 1}};

        testCase.put("1", new Object[]{times1, 4, 2});
        testCase.put("2", new Object[]{times2, 2, 1});
        testCase.put("3", new Object[]{times2, 2, 2});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 2);
        resultCase.put("2", 1);
        resultCase.put("3", -1);
        return resultCase;
    }

}
