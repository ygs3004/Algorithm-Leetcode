package ygs.leetcode.main.problem.slidingWindow.minimumWindowSubstring;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{"ADOBECODEBANC", "ABC"});
        testCase.put("2", new Object[]{"a","a"});
        testCase.put("3", new Object[]{"a","aa"});

        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", "BANC");
        resultCase.put("2", "a");
        resultCase.put("3", "");
        return resultCase;
    }

}
