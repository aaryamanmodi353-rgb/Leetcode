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

        ListNode fastPointer = head;
        int i = 0;
        for(i = 0;i < n;i++){
            fastPointer = fastPointer.next;
            if(fastPointer == null){
                return head.next;
            }
        }
        

        ListNode slowPointer = head;

        while(fastPointer.next != null){
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        ListNode delete = slowPointer.next;
        slowPointer.next = slowPointer.next.next;
        delete.next = null;


        return head;


        
    }
}