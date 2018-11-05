/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode node = head;
        while(node!=null){
            length++;
            node = node.next;
        }
        node = head;
        if(n>length){
            return null;
        }
        int index = length-n;
        if(index==0){
            head = head.next;
        }
        node =head;
        while(index>0){
            if(index==1){
                node.next = node.next.next;
            }
            index--;
            node = node.next;
        }
        return head;
    }
}
