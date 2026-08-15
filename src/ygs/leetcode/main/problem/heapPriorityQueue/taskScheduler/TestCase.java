package ygs.leetcode.main.problem.heapPriorityQueue.taskScheduler;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        char[] tasks1 = new char[]{'A','A','A','B','B','B'};
        char[] tasks2 = new char[]{'A','C','A','B','D','B'};
        char[] tasks3 = new char[]{'A','A','A','B','B','B'};
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{tasks1, 2});
        testCase.put("2", new Object[]{tasks2, 1});
        testCase.put("3", new Object[]{tasks3, 3});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 8);
        resultCase.put("2", 6);
        resultCase.put("3", 10);
        return resultCase;
    }

}
