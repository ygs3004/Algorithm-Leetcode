package ygs.leetcode.main.problem.intervals.insertInterval;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){

        HashMap<String, Object[]> testCase = new HashMap<>();
        int[][] intervals1 = {
                {1,3},
                {6,9},
        };
        int[] newIntervals1 = {2,5};

        int[][] intervals2 = {
                {1,2},
                {3,5},
                {6,7},
                {8,10},
                {12,16}
        };
        int[] newIntervals2 = {4,8};
        testCase.put("1", new Object[]{intervals1, newIntervals1});
        testCase.put("2", new Object[]{intervals2, newIntervals2});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        int[][] answer1 = {
                {1,5},
                {6,9},
        };

        int[][] answer2 = {
                {1,2},
                {3,10},
                {12,16},
        };

        resultCase.put("1", answer1);
        resultCase.put("2", answer2);
        return resultCase;
    }

}
