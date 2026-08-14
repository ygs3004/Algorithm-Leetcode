package ygs.leetcode.main.problem.twoPointers.containerWithMostWater;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{new int[]{1,8,6,2,5,4,8,3,7}});
        testCase.put("2", new Object[]{new int[]{1,1}});

        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 49);
        resultCase.put("2", 1);
        return resultCase;
    }

}
