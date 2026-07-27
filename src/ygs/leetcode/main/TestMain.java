package ygs.leetcode.main;

import ygs.leetcode.main.problem.twoPointers.isPalindrome.Solution;

public class TestMain {

    public static void main(String[] args) throws Exception {
        Leetcode leetcode = new Leetcode();

        // leetcode.setSolutionMethodName("twoSum").setAnswer(new ygs.leetcode.main.problem.arrayHashing.twoSum.Solution()).test();
        // leetcode.setSolutionMethodName("isPalindrome").setAnswer(new ygs.leetcode.main.problem.twoPointers.isPalindrome.Solution()).test();
        // leetcode.setSolutionMethodName("isValid").setAnswer(new ygs.leetcode.main.problem.stacks.validParentheses.Solution()).test();
        leetcode.setSolutionMethodName("search").setAnswer(new ygs.leetcode.main.problem.binarySearch.binarySearch.Solution()).test();
    }

}
