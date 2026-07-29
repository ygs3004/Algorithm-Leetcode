package ygs.leetcode.main.problem.trees.binaryTreeLevelOrderTraversal;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }

        Queue<TreeNode> que = new ArrayDeque<>();
        que.offer(root);

        while (!que.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            int queSize = que.size();

            while (queSize-- > 0) {
                TreeNode node = que.poll();
                levelList.add(node.val);
                if (node.left != null) {
                    que.offer(node.left);
                }

                if (node.right != null) {
                    que.offer(node.right);
                }
            }
            if (levelList.size() > 0) {
                answer.add(levelList);
            }
        }

        return answer;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}