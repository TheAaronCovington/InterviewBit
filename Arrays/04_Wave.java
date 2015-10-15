/*
 *  DESCRIPTION:  Given an array of integers, sort the array into a wave like array and return it, 
    In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
    EXAMPLE: Given [1, 2, 3, 4]
    One possible answer : [2, 1, 4, 3]
    Another possible answer : [4, 1, 3, 2]
    NOTE: If multiple answers are possible return the one that is lexicographically smallest. [2,1,4,3]
*/

public class Solution {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    Collections.sort(a); //Sort first
	    for(int i = 0; i < a.size()-1; i += 2){ //increment by 2
	        Integer temp = a.get(i); //swap pair then move on to the next two
	        a.set(i, a.get(i+1));
	        a.set(i+1, temp);
	    }
	    return a; //return results
	}
}
