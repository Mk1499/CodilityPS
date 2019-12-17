import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        int [] arr = {-1,-1,5,-1};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int maxDiff = Integer.MIN_VALUE ;
        Arrays.sort(A);
        for (int i = 0; i <A.length-1 ; i++) {
            if (maxDiff < (Math.abs(A[i] - A[i+1])) )
                maxDiff = Math.abs(A[i] - A[i+1]) ;
        }
        return maxDiff/2 ;
    }
}
