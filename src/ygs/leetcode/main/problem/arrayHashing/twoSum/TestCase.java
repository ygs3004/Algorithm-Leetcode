package ygs.leetcode.main.problem.arrayHashing.twoSum;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{new int[]{2,7,11,15}, 9});
        testCase.put("2", new Object[]{new int[]{3,2,4}, 6});
        testCase.put("3", new Object[]{new int[]{3,3}, 6});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", new int[]{0, 1});
        resultCase.put("2", new int[]{1, 2});
        resultCase.put("3", new int[]{0, 1});
        return resultCase;
    }

}
