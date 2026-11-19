/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer){
                break;
            }
        }

        if(fastPointer == null || fastPointer .next == null){
            return null;
        }

        slowPointer = head;

        while(slowPointer != fastPointer){
            
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;

           
        }

        return slowPointer;
        
    }
}