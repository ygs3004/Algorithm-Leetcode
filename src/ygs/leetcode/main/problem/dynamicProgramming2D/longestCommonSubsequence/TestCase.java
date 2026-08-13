package ygs.leetcode.main.problem.dynamicProgramming2D.longestCommonSubsequence;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{"abcde", "ace"});
        testCase.put("2", new Object[]{"abc", "abc"});
        testCase.put("3", new Object[]{"abc", "def"});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 3);
        resultCase.put("2", 3);
        resultCase.put("3", 0);
        return resultCase;
    }

}
