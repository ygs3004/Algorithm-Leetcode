package ygs.leetcode.main.problem.linkedList.mergeKortedLists;

import ygs.leetcode.main.problem.linkedList.ListNode;

import java.util.*;
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
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((node1, node2) -> node2.val - node1.val);
        for(ListNode node: lists){
            while(node != null){
                pq.add(node);
                node = node.next;
            }
        }

        ListNode head = null;
        ListNode next = null;
        while(!pq.isEmpty()){
            head = pq.poll();
            head.next = next;
            next = head;
        }

        return head;
    }
}