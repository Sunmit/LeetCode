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
        if(head==null){
            return false;
        }
        Set<ListNode> set = new HashSet();
        set.add(head);
        while(head.next!=null){
            head = head.next;
            if(set.contains(head)){
                return true;
            }else{
                set.add(head);
            }
        }
        return false;
    }
}
