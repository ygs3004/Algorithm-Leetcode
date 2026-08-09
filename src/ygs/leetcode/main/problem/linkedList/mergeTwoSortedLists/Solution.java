package ygs.leetcode.main.problem.linkedList.mergeTwoSortedLists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.*;

class Solution {

    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b.compareTo(a));

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer = null;
        pqAddAllList(list1);
        pqAddAllList(list2);
        while(!pq.isEmpty()){
            answer = new ListNode(pq.poll(), answer);
        }

        return answer;
    }

    private void pqAddAllList(ListNode list){
        while(list != null){
            pq.add(list.val);
            list = list.next;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}