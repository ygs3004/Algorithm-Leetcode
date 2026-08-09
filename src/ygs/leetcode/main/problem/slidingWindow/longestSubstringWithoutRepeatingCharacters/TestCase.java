package ygs.leetcode.main.problem.slidingWindow.longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{"abcabcbb"});
        testCase.put("2", new Object[]{"bbbbb"});
        testCase.put("3", new Object[]{"pwwkew"});

        return testCase;
    }

    public HashMap<String, Integer> getResult(){
        HashMap<String, Integer> resultCase = new HashMap<>();
        resultCase.put("1", 3);
        resultCase.put("2", 1);
        resultCase.put("3", 3);
        return resultCase;
    }

}
