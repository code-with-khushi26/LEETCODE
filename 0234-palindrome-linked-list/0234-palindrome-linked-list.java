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
    public boolean isPalindrome(ListNode head) {
        ListNode duplicate=new ListNode(head.val);
        ListNode curr=head.next;
        ListNode copy=duplicate;

        while(curr!=null){
            ListNode node=new ListNode(curr.val);
            copy.next=node;
            copy=copy.next;
            curr=curr.next;
        }

        ListNode reversed=reverse(duplicate);

        ListNode c1=head;
        ListNode c2=reversed;

        while(c1!=null){
            if(c1.val!=c2.val){
                return false;
            }
            c1=c1.next;
            c2=c2.next;
        }
        return true;

    }

    public ListNode reverse(ListNode head){
        ListNode next;
        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    }
