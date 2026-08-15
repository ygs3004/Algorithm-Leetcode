package ygs.leetcode.main.problem.trees.lowestCommonAncestorOfaBinarySearchTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pVal = p.val;
        int qVal = q.val;

        while(root != null){
            int curVal = root.val;
            if(curVal > pVal && curVal > qVal){
                root = root.left;
            }else if(curVal < pVal && curVal < qVal){
                root = root.right;
            }else{
                return root;
            }
        }

        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}