import java.util.Stack;

public class StoneWall {

    public static void main(String[] args) {
        int[] h = {8,8,5,7,9,8,7,4,8};
        System.out.println(solution(h));
    }

    public static int solution(int[] H) {
        // write your code in Java SE 8
        int blockCount = 0;
        Stack stack = new Stack();


        if(H.length == 1){
            return 1;
        } else if (H.length == 0){
            return 0;
        }

        for(int i= 0; i < H.length ; i++){

            while(!stack.isEmpty() && (int)stack.peek() > H[i]) {
                stack.pop();
            }

            if(stack.isEmpty()){
                stack.push(H[i]);
                blockCount++;
            }

            if(!stack.isEmpty() && (int) stack.peek() != H[i]){
                stack.push(H[i]);
                blockCount++;
            }



        }
        return blockCount;
    }
}
