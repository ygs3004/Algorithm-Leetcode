package ygs.leetcode.main.problem.bitManipulation.numberof1Bits;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{11});
        testCase.put("2", new Object[]{128});
        testCase.put("3", new Object[]{2147483645});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 3);
        resultCase.put("2", 1);
        resultCase.put("3", 30);
        return resultCase;
    }

}
