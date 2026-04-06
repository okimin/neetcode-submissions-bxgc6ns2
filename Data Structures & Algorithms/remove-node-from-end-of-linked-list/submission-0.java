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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode cursor = head;

        while(cursor != null){
            cursor = cursor.next;
            length++;
        }

        if((length - n) == 0)
            return head.next;
        
        ListNode prev = null;

        cursor = head;
        while(length != n){
            prev = cursor;
            cursor = cursor.next;
            length--;
        }

        prev.next = cursor.next;

        return head;
    }
}
