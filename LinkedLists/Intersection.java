/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
	    int countA = 0;
	    int countB = 0;
	    ListNode current = a; ListNode currentB = b;
	    while(current != null){
	        countA++;
	        current = current.next;
	    }
	    while(currentB != null){
	        countB++;
	        currentB = currentB.next;
	    }
	    current = a; currentB = b;
	    while(countA > 0 && countB > 0){
	        if(countA > countB){
	            countA--;
	            current = current.next;
	        }
	        if(countB > countA){
	            countB--;
	            currentB = currentB.next;
	        }
	        if(countA == countB){
	            if(current == currentB){
	                return current;
	            }
	            else{
	                current = current.next;
	                currentB = currentB.next;
	                countA--;
	                countB--;
	            }
	        }
	    }
	    
	    return null;
	}
}
