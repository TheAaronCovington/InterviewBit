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
	    ListNode currentA = a, currentB = b;
	    int countA = 0, countB = 0;
	    while(currentA != null){
	        countA++;
	        currentA = currentA.next;
	    }
	    while(currentB != null){
	        countB++;
	        currentB = currentB.next;
	    }
	    currentA = a; currentB = b;
	    while(countA > 0 && countB > 0){
	        if(countA > countB){
	            countA--;
	            currentA = currentA.next;
	        }
	        else if(countB > countA){
	            countB--;
	            currentB = currentB.next;
	        }
	        else{
	            if(currentA == currentB){
	                return currentA;
	            }
	            else{
	                currentA = currentA.next;
	                currentB = currentB.next;
	                countA--;
	                countB--;
	            }
	        }
	    }
	    return null;
	}
}

