package ygs.leetcode.main.problem.trees.serializeAndDeserializeBinaryTree;

import ygs.leetcode.main.problem.trees.TreeNode;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    static String NULL_VALUE_STR = "null";
    static String SEPARATOR = "/";
    static String SEPARATOR_VALUE = ",";
    static String SEPARATOR_PART = "~";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return NULL_VALUE_STR;

        Queue<Object[]> q = new ArrayDeque<>();
        int id = 0;
        q.add(new Object[]{root, id++});

        StringBuilder sbValue = new StringBuilder();
        StringBuilder sbFormation = new StringBuilder();

        while(!q.isEmpty()){
            Object[] rootInfo = q.poll();;
            TreeNode node = (TreeNode)rootInfo[0];
            int nodeId = (int)rootInfo[1];

            sbValue.append(nodeId);
            sbValue.append(SEPARATOR_VALUE);
            sbValue.append(node.val);
            sbValue.append(SEPARATOR);

            sbFormation.append(nodeId);
            sbFormation.append(SEPARATOR_VALUE);
            int leftId = id++;
            sbFormation.append(leftId);
            sbFormation.append(SEPARATOR_VALUE);
            int rightId = id++;
            sbFormation.append(rightId);
            sbFormation.append(SEPARATOR);

            if(node.left != null){
                q.add(new Object[]{node.left, leftId});
            }
            if(node.right != null){
                q.add(new Object[]{node.right, rightId});
            }
        }
        sbFormation.deleteCharAt(sbFormation.length() - 1);
        sbValue.deleteCharAt(sbValue.length() - 1);
        String result = sbValue.toString() + SEPARATOR_PART + sbFormation.toString();
        return result;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals(NULL_VALUE_STR)){
            return null;
        }

        String[] info = data.split(SEPARATOR_PART);
        String nodeValues = info[0];
        String nodeFormations = info[1];
        String[] nodeIdValueArr = nodeValues.split(SEPARATOR);
        String[] rootInfo = nodeIdValueArr[0].split(SEPARATOR_VALUE);
        String rootKey = rootInfo[0];

        Map<String, TreeNode> nodes = new HashMap<>();

        for(String nodeIdValue: nodeIdValueArr){
            String[] idValue = nodeIdValue.split(SEPARATOR_VALUE);
            String id = idValue[0];
            String value = idValue[1];
            nodes.put(id, new TreeNode(Integer.parseInt(value)));
        }

        String[] nodeFormationArr = nodeFormations.split(SEPARATOR);
        for(String nodeForamtion: nodeFormationArr){
            String[] formation = nodeForamtion.split(SEPARATOR_VALUE);
            String main = formation[0];
            String left = formation[1];
            String right = formation[2];
            TreeNode mainNode = nodes.get(main);

            if(nodes.containsKey(left)){
                mainNode.left = nodes.get(left);
            }

            if(nodes.containsKey(right)){
                mainNode.right = nodes.get(right);
            }
        }

        return nodes.get(rootKey);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));