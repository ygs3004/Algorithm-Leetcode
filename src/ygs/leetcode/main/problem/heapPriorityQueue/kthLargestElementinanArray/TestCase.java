package ygs.leetcode.main.problem.heapPriorityQueue.kthLargestElementinanArray;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{new int[]{3,2,1,5,6,4}, 2});
        testCase.put("2", new Object[]{new int[]{3,2,3,1,2,4,5,5,6}, 4});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 5);
        resultCase.put("2", 4);
        return resultCase;
    }

}
