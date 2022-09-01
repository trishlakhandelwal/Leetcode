/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        boolean flag = false;
        if(head==null)
            return false;
        else
        {
            while(head.next!=null)
            {
                set.add(head);
                head = head.next;
                if(set.contains(head))
                {
                    flag = true;
                    break;
                }
                //System.out.println("HashSet: " + set);
            }
            return flag;
        } 
    }
}