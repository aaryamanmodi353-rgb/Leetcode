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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode curr = head;
        ListNode prev = null;
        ListNode before = null;
        ListNode tail = head;

        int times = right - left + 1;

        int pos = 1;

        while(pos < left){

            before = tail;
            tail = tail.next;
            pos++;

        }

        curr = tail;

        while(times > 0){

            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            times--;

        }

        tail.next = curr;


        if(before != null){
            
            before.next = prev;
            return head;

        }

        return prev;

       
    }
}