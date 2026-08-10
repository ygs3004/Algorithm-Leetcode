package ygs.leetcode.main.problem.heapPriorityQueue.kClosestPointstoOrigin;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        int[][] points1 = new int[][]{{1,3},{-2,2}};
        int[][] points2 = new int[][]{{3,3},{5,-1},{-2,4}};
        HashMap<String, Object[]> testCase = new HashMap<>();
        testCase.put("1", new Object[]{points1, 1});
        testCase.put("2", new Object[]{points2, 2});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        int[][] answer1 = new int[][]{{-2,2}};
        int[][] answer2 = new int[][]{{-2,4},{3,3}};
        resultCase.put("1", answer1);
        resultCase.put("2", answer2);
        return resultCase;
    }

}
