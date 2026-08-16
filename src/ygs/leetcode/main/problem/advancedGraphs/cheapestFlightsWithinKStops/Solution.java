package ygs.leetcode.main.problem.advancedGraphs.cheapestFlightsWithinKStops;

import java.util.*;

public class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<Route>[] prices = new ArrayList[n];
        for(int i = 0; i < n; i++){
            prices[i] = new ArrayList<>();
        }

        PriorityQueue<Route> pq = new PriorityQueue<>((a, b) -> {
            if(a.stop == b.stop){
                return a.price - b.price;
            }
            return a.stop - b.stop;
        });

        for(int[] flight: flights){
            int from = flight[0];
            int to = flight[1];
            int price = flight[2];

            prices[from].add(new Route(to, price, 0));
        }

        for(Route route: prices[src]){
            pq.add(route);
        }

        int[] minValue = new int[n];
        Arrays.fill(minValue, Integer.MAX_VALUE);
        while(!pq.isEmpty()){
            Route now = pq.poll();
            int to = now.to;
            int price = now.price;
            int stop = now.stop;
            if(k < stop){
                continue;
            }

            if(minValue[to] < price){
                continue;
            }

            minValue[to] = price;

            for(Route next: prices[to]){
                int nextTo = next.to;
                int nextPrice = price + next.price;
                int nextStop = stop + 1;
                if(minValue[nextTo] > nextPrice){
                    pq.add(new Route(nextTo, nextPrice, nextStop));
                }
            }
        }

        return minValue[dst] == Integer.MAX_VALUE ? -1 : minValue[dst];
    }

    private class Route{
        int to;
        int price;
        int stop;

        Route(int to, int price, int stop){
            this.to = to;
            this.price = price;
            this.stop = stop;
        }
    }
}