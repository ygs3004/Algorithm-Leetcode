package ygs.leetcode.main.problem.advancedGraphs.reconstructItinerary;

import java.util.*;

public class Solution {

    List<String> answer;

    public List<String> findItinerary(List<List<String>> tickets) {

        Map<String, PriorityQueue<String>> graphs = new HashMap<>();
        answer = new ArrayList<>();

        int ticketCnt = 0;
        for(List<String> ticket: tickets){
            String from = ticket.get(0);
            String to = ticket.get(1);
            if(!graphs.containsKey(from)){
                graphs.put(from, new PriorityQueue<>());
            }

            graphs.get(from).add(to);
        }

        dfs("JFK", graphs);

        return answer;
    }

    private void dfs(String airport, Map<String, PriorityQueue<String>> graphs){
        PriorityQueue<String> graph = graphs.get(airport);
        while(graph != null && !graph.isEmpty()){
            dfs(graph.poll(), graphs);
        }

        answer.addFirst(airport);
    }
}