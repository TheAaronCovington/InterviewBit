/* DESCRIPTION:  Given a matrix of M x N elements (M rows, N columns), return all elements
   of the matrix in spiral order. 
Input:  [[ 1, 2, 3 ],
         [ 4, 5, 6 ],
         [ 7, 8, 9 ]]
Output: [1,2,3,6,9,8,7,4,5]
*/
public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 int T = 0, B = a.size()-1, L = 0, R = a.get(0).size()-1; 
		 int dir = 0;
		 if(B <= 0){
		     return result;
		 }
		 while(L <= R && T <= B){
		     if(dir == 0){
		         for(int k = L; k <= R; k++){
		             result.add(a.get(T).get(k));
		         }
		         T++;
		     }
		     else if(dir == 1){
		         for(int k = T; k <= B; k++){
		             result.add(a.get(k).get(R));
		         }
		         R--;
		     }
		     else if(dir == 2){
		         for(int k = R; k >= L; k--){
		             result.add(a.get(B).get(k));
		         }
		         B--;
		     }
		     else if(dir == 3){
		         for(int k = B; k >= T; k--){
		             result.add(a.get(k).get(L));
		         }
		         L++;
		     }
		     dir = (dir+1) % 4;
		 }
		 return result;
	}
}
