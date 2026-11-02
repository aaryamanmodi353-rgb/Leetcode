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

     

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        int carry = 0;

        int sum = 0;

        while(l1 != null || l2 != null || carry != 0){
            
            sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(sum % 10);
            carry = sum / 10;
            
            curr.next = node;
            curr = curr.next;

            
        }

     


        return res.next;
    }
}