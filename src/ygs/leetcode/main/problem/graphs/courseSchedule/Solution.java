package ygs.leetcode.main.problem.graphs.courseSchedule;

import java.util.*;

public class Solution {

    static int VISITED = 1;
    static int COMPLETE = 2;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] preCourse = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++){
            preCourse[i] = new ArrayList<Integer>();
        }

        for(int[] info : prerequisites){
            int course = info[0];
            int need = info[1];

            preCourse[course].add(need);
        }

        int[] visited = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            if(preCourse[i].isEmpty()) continue;
            if(!isPossible(i, preCourse, visited)){
                return false;
            }
        }

        return true;
    }

    private boolean isPossible(int course, List<Integer>[] preCourse, int[] visited){

        if(visited[course] == COMPLETE){
            return true;
        }

        if(visited[course] == VISITED){
            return false;
        }

        visited[course] = VISITED;

        for(int pre: preCourse[course]){
            if(!isPossible(pre, preCourse, visited)){
                return false;
            };
        }

        visited[course] = COMPLETE;
        return true;
    }

}
