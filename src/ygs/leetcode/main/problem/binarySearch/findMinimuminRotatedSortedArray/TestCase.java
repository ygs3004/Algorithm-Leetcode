package ygs.leetcode.main.problem.binarySearch.findMinimuminRotatedSortedArray;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        int[] nums1 = {3,4,5,1,2};
        int[] nums2 = {4,5,6,7,0,1,2};
        int[] nums3 = {11,13,15,17};
        testCase.put("1", new Object[]{nums1});
        testCase.put("2", new Object[]{nums2});
        testCase.put("3", new Object[]{nums3});
        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        resultCase.put("1", 1);
        resultCase.put("2", 0);
        resultCase.put("3", 11);
        return resultCase;
    }

}
