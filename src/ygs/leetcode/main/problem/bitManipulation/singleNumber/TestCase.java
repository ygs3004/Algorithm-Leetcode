package ygs.leetcode.main.problem.bitManipulation.singleNumber;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{new int[]{2,2,1}});
        testCase.put("2", new Object[]{new int[]{4,1,2,1,2}});
        testCase.put("3", new Object[]{new int[]{1}});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 1);
        resultCase.put("2", 4);
        resultCase.put("3", 1);
        return resultCase;
    }

}
