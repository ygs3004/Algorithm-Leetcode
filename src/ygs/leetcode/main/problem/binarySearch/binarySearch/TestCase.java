package ygs.leetcode.main.problem.binarySearch.binarySearch;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{new int[]{-1,0,3,5,9,12}, 9});
        testCase.put("2", new Object[]{new int[]{-1,0,3,5,9,12}, 2});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 4);
        resultCase.put("2", -1);
        return resultCase;
    }

}
