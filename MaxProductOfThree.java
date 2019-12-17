import java.util.Arrays;

public class MaxProductOfThree {

    public static void main(String[] args) {

        int [] arr = {-5,5,4,-10};
        System.out.println(solution(arr));

    }
    public  static int solution(int[] A) {
        // write your code in Java SE 8
        int prod1 , prod2  ;
        Arrays.sort(A);
        prod1 = A[0] * A[1] * A[A.length-1] ;
        prod2 = A[A.length-1] * A[A.length-2] * A[A.length-3] ;

        return prod1 > prod2 ? prod1 : prod2 ;
    }
}
