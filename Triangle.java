import java.util.Arrays;

public class Triangle  {

    public static void main(String[] args) {
        int[] arr = {Integer.MAX_VALUE , Integer.MAX_VALUE , Integer.MAX_VALUE};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
       int t = 0 ;
        if (A.length >= 3 ){
            Arrays.sort(A);
            for (int i = 0; i < A.length - 2 ; i++) {
                if (A[i] + A[i+1] > A[i+2])
                    return 1;
            }
        }
       return t;
    }


}
