/* DESCRIPTION:  Suppose a sorted array A is rotated at some pivot unknown to you beforehand.
                  (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
                  Find the minimum element. The array will not contain duplicates.
*/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int findMin(final List<Integer> a) {
	    int low = 0; int high = a.size()-1; int N = a.size();
	    while(low <= high){
	        int mid = low + (high - low)/2;
	        if(a.get(low) <= a.get(high)){
	            return a.get(low);
	        }
	        else if(a.get(mid) <= a.get((mid+1)%N) && a.get(mid) <= a.get((mid-1)%N)){
	            return a.get(mid);
	        }
	        else if(a.get(mid) <= a.get(high)){
	            high = mid+1;
	        }
	        else if(a.get(mid) >= a.get(low)){
	            low = mid + 1;
	        }
	    }
	    return -1;
	}
}
