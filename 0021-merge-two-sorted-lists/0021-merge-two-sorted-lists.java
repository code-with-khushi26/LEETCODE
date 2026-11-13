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
    public ListNode mergeTwoLists(ListNode l, ListNode m) {
        ListNode list=new ListNode(-1);
        ListNode temp=list;

        while(l!=null && m!=null){
            if(l.val<=m.val){
                temp.next=l;
                l=l.next;
            }

            else{
                temp.next=m;
                m=m.next;
            }
            temp=temp.next;
        }

        if(l!=null){
            temp.next=l;
        }
        if(m!=null){
            temp.next=m;
        }
        return list.next;
    }
}