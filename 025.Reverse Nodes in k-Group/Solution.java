/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count =0;
        while(curr!=null&&count!=k){ //找到第k+1个节点
            curr = curr.next;
            count++;
        }
        if(count==k){ //第k+1个节点存在
            curr = reverseKGroup(curr,k);
            while(count-->0){ //求k的逆序
                ListNode tmp = head.next;
                head.next = curr;
                curr = head;
                head = tmp;
            }
            head = curr;
        }
        return head;
    }
}
