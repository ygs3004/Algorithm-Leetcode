package ygs.leetcode.main.problem.graphs.cloneGraph;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

import java.util.*;

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;

        Node[] copys = new Node[101];
        List[] copyLists = new ArrayList[101];
        boolean[] visited = new boolean[101];

        Queue<Node> que = new ArrayDeque<>();
        que.add(node);

        while(!que.isEmpty()){
            Node origin = que.poll();
            List<Node> orgNeighbors = origin.neighbors;

            if(visited[origin.val]) continue;
            visited[origin.val] = true;

            Node copy = getOrCreate(copys, origin.val);
            copyLists[origin.val] = copy.neighbors;
            List<Node> copyList = copyLists[origin.val];

            copys[origin.val].neighbors = copyLists[origin.val];

            for(Node originNeighbor: orgNeighbors){
                int neighborVal = originNeighbor.val;
                copyList.add(getOrCreate(copys, neighborVal));

                if(!visited[originNeighbor.val]){
                    que.add(originNeighbor);
                }
            }
        }

        return copys[node.val];
    }

    private Node getOrCreate(Node[] copys, int val){
        if(copys[val] == null){
            copys[val] = new Node(val);
        }

        return copys[val];
    }

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}