import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {

        int [] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        System.out.println(solution(arr));
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int num ;
        Arrays.sort(A);
        for (int i = 0; i <A.length-1 ; i++) {
            if (A[i+1] - A[i] > 1 && A[i]>=0 && A[i+1]>0 )
                return A[i]+1;
        }
        if (A[A.length-1]>0){
            return A[A.length-1]+1;
        }
        else
            return 1 ;
    }

}
