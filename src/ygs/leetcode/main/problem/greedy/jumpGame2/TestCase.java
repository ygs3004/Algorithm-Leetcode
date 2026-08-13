package ygs.leetcode.main.problem.greedy.jumpGame2;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{new int[]{2,3,1,1,4}});
        testCase.put("2", new Object[]{new int[]{2,3,0,1,4}});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 2);
        resultCase.put("2", 2);
        return resultCase;
    }

}
