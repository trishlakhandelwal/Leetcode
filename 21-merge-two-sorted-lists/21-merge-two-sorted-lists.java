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
        //create output LinkedList
        ListNode node = new ListNode();
        if(list1==null && list2==null)
            return null;
        else if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        else
        {
            if(list1.val<list2.val)
            {
                node = list1;
                list1 = list1.next;
            }
            else
            {
                node = list2;
                list2 = list2.next;
            }
            node.next = mergeTwoLists(list1, list2);
            return node;
        }
    }
}