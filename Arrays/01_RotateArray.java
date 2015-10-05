/* DESCRIPTION: Rotate an Array "A" by B positions.
   FOR EXAMPLE:  A : [1 2 3 4 5 6]
                 B : 1
                 
   OUTPUT:  [2 3 4 5 6 1]
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
