package ygs.leetcode.main.problem.twoPointers.isPalindrome;

import java.util.ArrayList;
import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{"A man, a plan, a canal: Panama"});
        testCase.put("2", new Object[]{"race a car"});
        testCase.put("3", new Object[]{" "});

        return testCase;
    }

    public HashMap<String, Boolean> getResult(){
        HashMap<String, Boolean> resultCase = new HashMap<>();
        resultCase.put("1", true);
        resultCase.put("2", false);
        resultCase.put("3", true);
        return resultCase;
    }

}
