package ygs.leetcode.main.problem.heapPriorityQueue.taskScheduler;

import java.util.*;

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Task> pq = new PriorityQueue<>();
        int[] repeats = new int[26];

        // 문자별 반복 횟수 체크
        for(int i = 0; i < tasks.length; i++){
            char c = tasks[i];
            repeats[c - 'A']++;
        }

        // 문자 반복 및 값 정보 pq 에 삽입,
        // n의 최대값이 100이므로 초기 lastIdx를 충분히 낮은 값인 -101로 주었다.
        // Integer.MIN_VALUE 처럼 극한 값을 주면 오버플로우 발생 가능
        for(int i = 0; i < repeats.length; i++){
            if(repeats[i] > 0){
                char c = (char)(i + 'A');
                pq.add(new Task(repeats[i], c, -101));
            }
        }

        int cnt = 0;
        while(!pq.isEmpty()){
            PriorityQueue<Task> next = new PriorityQueue<>();
            cnt++;

            // 실행 할수 있는 Task 가 있는지 확인
            while(!pq.isEmpty()){
                Task task = pq.poll();
                int lastIdx = task.lastIdx;
                if(cnt - lastIdx > n){
                    task.lastIdx = cnt;
                    task.repeat--;

                    if(task.repeat > 0){
                        next.add(task);
                    }
                    break;

                }
                // Task 가 next로 전부 이동될 동안 실행 불가능할 경우 idle
                next.add(task);
            }

            // 나머지 Task next 로 이동
            while(!pq.isEmpty()){
                next.add(pq.poll());
            }

            // next pq를 이용하여 다음 체크
            pq = next;
        }

        return cnt;
    }

    private static class Task implements Comparable<Task>{
        int repeat;
        char value;
        int lastIdx;

        Task(int repeat, char value, int lastIdx){
            this.repeat = repeat;
            this.value = value;
            this.lastIdx = lastIdx;
        }

        @Override
        public int compareTo(Task o){
            return Integer.compare(o.repeat, this.repeat);
        }
    }
}