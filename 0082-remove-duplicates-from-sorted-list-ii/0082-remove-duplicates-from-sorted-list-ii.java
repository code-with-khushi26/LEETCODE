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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list=new ListNode(-1);
        list.next=head;
        ListNode curr=head;
        ListNode prev=list;

        while(curr!=null){
            if(curr.next!=null && curr.val==curr.next.val){
                int x=curr.val;
                while(curr!=null &&curr.val==x){
                    curr=curr.next;
                }
                prev.next=curr;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        return list.next;
    }
}