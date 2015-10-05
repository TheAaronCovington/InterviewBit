/* DESCRIPTION: Rotate an Array "A" by B positions.
   FOR EXAMPLE:  A : [1 2 3 4 5 6]
                 B : 1
                 
   OUTPUT:  [2 3 4 5 6 1]
   NOTE:  MOD is used to keep the array from overflowing.  The MOD operator has the following rules
   1.) If X < Y then X % Y will always = X
   2.) If X / Y is a whole number and not a fraction then X % Y will always = 0;
   3.) If X / Y is a fraction then X % Y will be the remainder.
*/
public class Solution {
	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			ret.add(A.get((i + B) % A.size()));
		}
		return ret;
	}
}
