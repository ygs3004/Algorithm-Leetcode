package ygs.leetcode.main.problem.stacks.dailyTemperatures;

import java.util.HashMap;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        int[] temperatures1 = {73,74,75,71,69,72,76,73};
        int[] temperatures2 = {30,40,50,60};
        int[] temperatures3 = {30,60,90};
        testCase.put("1", new Object[]{temperatures1});
        testCase.put("2", new Object[]{temperatures2});
        testCase.put("3", new Object[]{temperatures3});

        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        int[] answer1 = {1,1,4,2,1,1,0,0};
        int[] answer2 = {1,1,1,0};
        int[] answer3 = {1,1,0};
        resultCase.put("1", answer1);
        resultCase.put("2", answer2);
        resultCase.put("3", answer3);
        return resultCase;
    }

}
