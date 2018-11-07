/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        return process(lists,0,lists.length-1);
    }
    
    private ListNode process(ListNode[] lists,int s,int e){
        if(s==e){
            return lists[s];
        }
        if(s<e){
            int h = (s+e)/2;
            ListNode ln1 = process(lists,s,h);
            ListNode ln2 = process(lists,h+1,e);
            return merge(ln1,ln2);
        }else{
            return null;
        }
        
    }
    
    private ListNode merge(ListNode ln1,ListNode ln2){
        if(ln1==null) return ln2;
        if(ln2==null) return ln1;
        if(ln1.val<ln2.val){
            ln1.next = merge(ln1.next,ln2);
            return ln1;
        }else{
            ln2.next = merge(ln1,ln2.next);
            return ln2;
        }
    }
}
