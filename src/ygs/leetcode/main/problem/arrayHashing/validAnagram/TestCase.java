package ygs.leetcode.main.problem.arrayHashing.validAnagram;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{"anagram", "nagaram"});
        testCase.put("2", new Object[]{"rat", "cat"});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", true);
        resultCase.put("2", false);
        return resultCase;
    }

}
