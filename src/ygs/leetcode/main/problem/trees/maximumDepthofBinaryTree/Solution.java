package ygs.leetcode.main.problem.trees.maximumDepthofBinaryTree;

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

import java.util.*;

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        Queue<Depth> que = new ArrayDeque<>();
        Depth rootDepth = new Depth(root, 1);
        que.add(rootDepth);
        int answer = 0;

        while(!que.isEmpty()){
            Depth curDepth = que.poll();
            int depth = curDepth.depth;
            TreeNode cur = curDepth.node;
            answer = Math.max(depth, answer);

            if(cur.left != null){
                Depth nextLeftDepth = new Depth(cur.left, depth + 1);
                que.add(nextLeftDepth);
            }

            if(cur.right != null){
                Depth rightLeftDepth = new Depth(cur.right, depth + 1);
                que.add(rightLeftDepth);
            }
        }

        return answer;
    }

    private class Depth{
        TreeNode node;
        int depth;

        Depth(TreeNode node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}