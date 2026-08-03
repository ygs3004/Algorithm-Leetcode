package ygs.leetcode.main.problem.advancedGraphs.networkDelayTime;

import java.util.*;

public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        // node 정보를 담을 List 초기화
        List<Node>[] nodes = new List[n + 1];
        for(int i = 0; i < nodes.length; i++){
            nodes[i] = new ArrayList<>();
        }

        for(int[] time: times){
            int from = time[0];
            int to = time[1];
            int travel = time[2];
            // node 정보 List에 담기
            nodes[from].add(new Node(to, travel));
        }

        // 다익스트라 알고리즘을 사용하기 위한 pq
        // 최단경로를 저장하기 위한 travels
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int[] travels = new int[n + 1];

        // 최단경로 무한대로 초기화
        for(int i = 1; i < travels.length; i++){
            travels[i] = Integer.MAX_VALUE;
        }

        // 시작지점 처리
        travels[k] = 0;
        pq.add(new Node(k, 0));

        while(!pq.isEmpty()){
            Node cur = pq.poll();

            // 현재 지점까지 최단 경로인지 확인, visited 체크 역할
            if (cur.travel > travels[cur.node]){
                continue;
            }

            // 다음 경로 확인
            for (Node next : nodes[cur.node]) {
                int newTravel = cur.travel + next.travel;
                // 다음 경로중 최단경로인 경우 pq 경로 추가
                if (newTravel < travels[next.node]) {
                    travels[next.node] = newTravel;
                    pq.add(new Node(next.node, newTravel));
                }
            }
        }

        int answer = 0;
        for(int i = 1; i < travels.length; i++){
            // 가장 오래 걸린 경우 Network Delay를 마친 시간
            answer = Math.max(travels[i], answer);
        }

        // 도달하지 못한경우 초기 거리값을 가지고 있으므로 -1, 아니면 answer
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    private static class Node implements Comparable<Node>{
        int node;
        int travel;

        Node(int node, int travel){
            this.node = node;
            this.travel = travel;
        }

        @Override
        public int compareTo(Node o){
            return Integer.compare(this.travel, o.travel);
        }
    }
}

