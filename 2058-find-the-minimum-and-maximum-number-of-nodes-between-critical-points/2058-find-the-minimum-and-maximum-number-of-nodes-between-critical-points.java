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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int arr[]=new int[2];
        ListNode curr=head.next;
        ListNode prev=head;
        ListNode nextt=curr.next;
        int idx=2;
        int first=0;
        int last=0;
        int prevCritic=0;
        int minDist=Integer.MAX_VALUE;

        if (head==null || head.next==null || head.next.next==null)return new int[]{-1, -1};

        while(nextt!=null){
            if(curr.val>prev.val && curr.val>nextt.val || curr.val<prev.val && curr.val<nextt.val){
                if(first==0){
                    first=idx;
                    last=idx;
                    prevCritic=idx;
                }

                else{
                    minDist=Math.min(minDist,idx-prevCritic);
                    prevCritic=idx;
                    last=idx;
                }
            }
            prev=curr;
            curr=nextt;
            nextt=nextt.next;
            idx++;
        }

        if(first==last) return new int[]{-1,-1};

        arr[0]=minDist;
        arr[1]=last-first;

        return arr;
    }
}