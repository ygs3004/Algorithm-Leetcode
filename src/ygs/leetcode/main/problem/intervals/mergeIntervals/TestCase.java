package ygs.leetcode.main.problem.intervals.mergeIntervals;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        int[][] intervals1 = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        int[][] intervals2 = {
                {1,4},
                {4,5},
        };

        int[][] intervals3 = {
                {4,7},
                {1,4},
        };
        testCase.put("1", new Object[]{intervals1});
        testCase.put("2", new Object[]{intervals2});
        testCase.put("3", new Object[]{intervals3});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        int[][] answer1 = {
                {1,6},
                {8,10},
                {15,18}
        };

        int[][] answer2 = {
                {1,5},
        };

        int[][] answer3 = {
                {1,7},
        };

        resultCase.put("1", answer1);
        resultCase.put("2", answer2);
        resultCase.put("3", answer3);
        return resultCase;
    }

}
