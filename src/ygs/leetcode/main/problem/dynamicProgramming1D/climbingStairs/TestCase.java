package ygs.leetcode.main.problem.dynamicProgramming1D.climbingStairs;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{2});
        testCase.put("2", new Object[]{3});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 2);
        resultCase.put("2", 3);
        return resultCase;
    }

}
