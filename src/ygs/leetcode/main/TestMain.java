package ygs.leetcode.main;

public class TestMain {

    public static void main(String[] args) throws Exception {
        Leetcode leetcode = new Leetcode();

        // leetcode.setSolutionMethodName("twoSum").setAnswer(new ygs.leetcode.main.problem.array_hashing.twoSum.Solution()).test();
        leetcode.setSolutionMethodName("isPalindrome").setAnswer(new ygs.leetcode.main.problem.two_pointers.Solution()).test();
    }

}
