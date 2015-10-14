/*  DESCRIPTION:  You are in an infinite 2D grid where you can move in any of the 8 directions :
    (x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1) 
You are given a sequence of points and the order in which you need to cover the points. Give 
the minimum number of steps in which you can achieve it. You start from the first point.
Example :
Input : [(0, 0), (1, 1), (1, 2)]
Output : 2
It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).
*/
public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int currentX = X.get(0); int currentY = Y.get(0);
        int steps = 0;
        for(int i = 0; i < X.size(); i++){
            steps += Math.max(Math.abs(currentX - X.get(i)), Math.abs(currentY - Y.get(i)));
            currentX = X.get(i);
            currentY = Y.get(i);
        }
        return steps;
    }
}
