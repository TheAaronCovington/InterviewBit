/*
* DESCRIPTION:  Find out the maximum sub-array of non negative numbers from an array.
The sub-array should be continuous. That is, a sub-array created by choosing the second
and fourth element and skipping the third element is invalid.
Maximum sub-array is defined in terms of the sum of the elements in the sub-array.
Sub-array A is greater than sub-array B if sum(A) > sum(B).

Example:
A : [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]
NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length
NOTE 2: If there is still a tie, then return the segment with minimum starting index
*/

public class Solution {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    long currentSum = 0; long maxSum = 0;
	    ArrayList<Integer> maxRange = new ArrayList<Integer>();
	    ArrayList<Integer> currentRange = new ArrayList<Integer>();
	    for(int i = 0; i < a.size(); i++){
	        if(a.get(i) >= 0){
	            currentSum += a.get(i);
	            currentRange.add(a.get(i));
	        }
	        else{
	            currentSum = 0;
	            currentRange = new ArrayList<Integer>();
	        }
	        if((maxSum < currentSum) || ((maxSum == currentSum) && 
	        (currentRange.size() > maxRange.size()))){
	            maxSum = currentSum;
	            maxRange = currentRange;
	        }
	    }
	    return maxRange;
	}
}
