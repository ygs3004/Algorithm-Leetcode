package ygs.leetcode.main.problem.mathGeometry.spiralMatrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestCase {

    public HashMap<String, Object[]> getInput(){
        HashMap<String, Object[]> testCase = new HashMap<>();
        int[][] matrix1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] matrix2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int[][] matrix3 = {
                {1}
        };

        testCase.put("1", new Object[]{matrix1});
        testCase.put("2", new Object[]{matrix2});
        testCase.put("3", new Object[]{matrix3});

        return testCase;
    }

    public HashMap<String, Object> getResult(){
        HashMap<String, Object> resultCase = new HashMap<>();
        List<Integer> result1 = new ArrayList<>();
        result1.add(1);result1.add(2);result1.add(3);
        result1.add(6);result1.add(9);result1.add(8);
        result1.add(7);result1.add(4);result1.add(5);

        List<Integer> result2 = new ArrayList<>();
        result2.add(1);result2.add(2);result2.add(3);result2.add(4);
        result2.add(8);result2.add(12);result2.add(11);result2.add(10);
        result2.add(9);result2.add(5);result2.add(6);result2.add(7);

        List<Integer> result3 = new ArrayList<>();
        result3.add(1);

        resultCase.put("1", result1);
        resultCase.put("2", result2);
        resultCase.put("3", result3);
        return resultCase;
    }

}
