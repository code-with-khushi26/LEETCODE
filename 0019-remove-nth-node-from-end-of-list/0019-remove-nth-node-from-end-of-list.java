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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l=0;
        ListNode curr=head;

        while(curr!=null){
            l++;
            curr=curr.next;
        }
        int ele=l-n;
        ListNode ans=head;

        if(l==n)return head.next;

        while(ele>1){
            ans=ans.next;
            ele--;
        }

        ans.next=ans.next.next;

        return head;
    }
}