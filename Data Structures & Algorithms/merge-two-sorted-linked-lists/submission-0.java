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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sentinel = new ListNode(-1);
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode cursor = sentinel;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                cursor.next = l1;
                l1 = l1.next;
            }
            else{
                cursor.next = l2;
                l2 = l2.next;
            }

            cursor = cursor.next;
        }

        if(l1 == null){
            cursor.next = l2;
        }
        else{
            cursor.next = l1;
        }

        return sentinel.next;
    }
}