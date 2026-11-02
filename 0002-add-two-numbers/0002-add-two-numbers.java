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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode res = new ListNode(-1);
        ListNode curr = res;

        ListNode head = l1;
        ListNode headnode = l2;

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        int carry = 0;

        int sum = 0;

        while(head != null || headnode != null){
            
            sum = carry;

            if(head != null){
                sum += head.val;
                head = head.next;
            }

            if(headnode != null){
                sum += headnode.val;
                headnode = headnode.next;
            }

            ListNode node = new ListNode(sum % 10);
            carry = sum / 10;
            
            curr.next = node;
            curr = curr.next;

            
        }

        if(carry != 0){
            ListNode node = new ListNode(carry);
            curr.next = node;
        }


        return res.next;
    }
}