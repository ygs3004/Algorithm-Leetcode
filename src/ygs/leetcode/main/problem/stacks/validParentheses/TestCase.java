package ygs.leetcode.main.problem.stacks.validParentheses;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{"()"});
        testCase.put("2", new Object[]{"()[]{}"});
        testCase.put("3", new Object[]{"(]"});
        testCase.put("4", new Object[]{"([])"});
        testCase.put("5", new Object[]{"([)]"});

        return testCase;
    }

    public HashMap<String, Boolean> getResult(){
        HashMap<String, Boolean> resultCase = new HashMap<>();
        resultCase.put("1", true);
        resultCase.put("2", true);
        resultCase.put("3", false);
        resultCase.put("4", true);
        resultCase.put("5", false);
        return resultCase;
    }

}
