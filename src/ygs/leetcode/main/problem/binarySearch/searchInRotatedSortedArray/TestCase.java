package ygs.leetcode.main.problem.binarySearch.searchInRotatedSortedArray;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{new int[]{4,5,6,7,0,1,2}, 0});
        testCase.put("2", new Object[]{new int[]{4,5,6,7,0,1,2}, 3});
        testCase.put("3", new Object[]{new int[]{1}, 0});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 4);
        resultCase.put("2", -1);
        resultCase.put("3", -1);
        return resultCase;
    }

}
