package ygs.leetcode.main.problem.linkedList.reorderList;

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
    public void reorderList(ListNode head) {
        Deque<ListNode> deque = new ArrayDeque<>();

        ListNode node = head.next;
        while(node != null){
            deque.addLast(node);
            node = node.next;
        }

        int i = 0;
        while(!deque.isEmpty()){
            ListNode next = null;
            if(i % 2 == 0){
                next = deque.pollLast();
            }else{
                next = deque.pollFirst();
            }

            head.next = next;
            head = next;
            i++;
        }

        head.next = null;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}