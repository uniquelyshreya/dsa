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
    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev =  null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head; int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp = head;
        int mid = (count/2)+1;
        ListNode temp2 = head;
        while(mid!=0){
            mid--;
            if(mid==0) break;
            temp2 = temp2.next;
            

        }
        ListNode newhead = reverse(temp2);
        temp2 = newhead;
        while(temp2 !=null){
            if(temp.val != temp2.val) return false;
            else{
                temp = temp.next;
                temp2 = temp2.next;
            }
        }
 newhead = reverse(newhead);
 return true;

    }
}
