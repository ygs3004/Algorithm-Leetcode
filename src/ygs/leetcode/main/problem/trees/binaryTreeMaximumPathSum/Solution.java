package ygs.leetcode.main.problem.trees.binaryTreeMaximumPathSum;

import ygs.leetcode.main.problem.trees.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    static int answer;

    public int maxPathSum(TreeNode root) {
        this.answer = Integer.MIN_VALUE;
        recursiveNode(root);
        return answer;
    }

    public int recursiveNode(TreeNode root){

        if(root == null) return 0;

        int val1 = root.val;
        int val2 = Math.max(recursiveNode(root.left), 0);
        int val3 = Math.max(recursiveNode(root.right), 0);

        int maxValue = val1 + val2 + val3;
        answer = Math.max(maxValue, answer);

        return val1 + Math.max(val2, val3);
    }
}