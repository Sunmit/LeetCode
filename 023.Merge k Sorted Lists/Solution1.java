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
        if(lists==null||lists.length==0){
            return null;
        }
        ListNode res =null;
        for(int i=0;i<lists.length;i++){
            if(lists[i]==null){
                continue;
            }
            ListNode start = res;
            res = null;
            ListNode temp = null;
            while(lists[i]!=null&&start!=null){
                int minval =0;
                if(start.val>lists[i].val){
                    minval=lists[i].val;
                    lists[i]=lists[i].next;
                }else{
                    minval=start.val;
                    start=start.next;
                }
                if(temp==null){
                    temp = new ListNode(minval);
                    res = temp;
                }else{
                    temp.next = new ListNode(minval);
                    temp=temp.next;
                }
            }
            if(start==null&&lists[i]==null){
                continue;
            }else if(lists[i]==null){
                if(res==null){
                    res=start;
                }else{
                    temp.next = start;
                }
            }else{
                if(res==null){
                    res=lists[i];
                }else{
                    temp.next = lists[i];
                }
            }
        }
        return res;
    }
}
