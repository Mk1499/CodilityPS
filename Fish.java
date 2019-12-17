// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] arrayOfFish, int[] fishDirection) {
        Stack<Integer> survivors =  new Stack<Integer>();
        Stack<Integer> survivorDirections = new Stack<Integer>();

        for (int i = 0; i < arrayOfFish.length; i++) {
            int currentFish = arrayOfFish[i],
                    currentDirection = fishDirection[i];

            if (currentDirection == 1 || survivors.empty()) {
                survivors.push(currentFish);
                survivorDirections.push(currentDirection);
            } else {
                boolean hasContenderBeenStopped = false;

                while (!hasContenderBeenStopped && !survivors.empty()) {
                    int currentDefender = survivors.peek(),
                            currentDefenderDirection = survivorDirections.peek();
                    if (currentDefenderDirection == 0) {
                        hasContenderBeenStopped = true;
                        survivors.push(currentFish);
                        survivorDirections.push(currentDirection);
                    }
                    else if (currentDefender > currentFish)
                        hasContenderBeenStopped = true;
                    else if (currentFish > currentDefender) {
                        survivors.pop();
                        survivorDirections.pop();
                    }
                }
                if (survivors.empty()) {
                    survivors.push(currentFish);
                    survivorDirections.push(currentDirection);
                }
            }
        }

        return survivors.size();
    }
}