package ygs.leetcode.main.problem.greedy.jumpGame;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{new int[]{2,3,1,1,4}});
        testCase.put("2", new Object[]{new int[]{3,2,1,0,4}});
        testCase.put("3", new Object[]{new int[]{0}});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", true);
        resultCase.put("2", false);
        resultCase.put("3", true);
        return resultCase;
    }

}
