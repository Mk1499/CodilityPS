import java.util.Arrays;

public class Distinct {

    public static void main(String[] args) {

        int [] arr = {Integer.MAX_VALUE , Integer.MIN_VALUE};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int count  ;
        if (A.length > 0 )
            count =1 ;
        else
            count =0 ;

        Arrays.sort(A);
        for (int i = 0; i <A.length-1 ; i++) {
            if(A[i]!= A[i+1])
                count++;
        }

return count;
    }

}
