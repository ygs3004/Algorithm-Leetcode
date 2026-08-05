package ygs.leetcode.main.problem.dynamicProgramming2D.uniquePaths;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{3, 7});
        testCase.put("2", new Object[]{3, 2});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 28);
        resultCase.put("2", 3);
        return resultCase;
    }

}
