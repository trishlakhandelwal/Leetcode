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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = null;
        ListNode curr = head;
        
        //swapping
        while(curr!=null)
        {
            prev = temp;
            temp = curr;
            curr = curr.next;
            temp.next = prev;
        }
        return temp;
    }
}