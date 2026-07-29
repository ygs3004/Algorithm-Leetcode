package ygs.leetcode.main.problem.linkedList.reverseLinkedList;

public class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode answer = null;

        while(head != null){
            answer = new ListNode(head.val, answer);
            head = head.next;
        }

        return answer;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}