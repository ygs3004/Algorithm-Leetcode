package ygs.leetcode.main.problem.slidingWindow.bestTimeTOBuyAndSell;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{new int[]{7, 1, 5, 3, 6, 4}});
        testCase.put("2", new Object[]{new int[]{7,6,4,3,1}});

        return testCase;
    }

    public HashMap<String, Integer> getResult(){
        HashMap<String, Integer> resultCase = new HashMap<>();
        resultCase.put("1", 5);
        resultCase.put("2", 0);
        return resultCase;
    }

}
