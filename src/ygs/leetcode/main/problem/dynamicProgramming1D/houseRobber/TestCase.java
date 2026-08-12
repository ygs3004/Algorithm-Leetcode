package ygs.leetcode.main.problem.dynamicProgramming1D.houseRobber;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{new int[]{1,2,3,1}});
        testCase.put("2", new Object[]{new int[]{2,7,9,3,1}});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 4);
        resultCase.put("2", 12);
        return resultCase;
    }

}
