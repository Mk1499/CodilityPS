import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        int [] arr  = {3,4,4,6,1,4,6};
        int [] rslt  = solution(5,arr);
        for (int i = 0; i <rslt.length ; i++) {
            System.out.println(rslt[i]);
        }
    }
    public static int[] solution(int N, int[] A) {
        int [] ctr = new int[N] ;
        int max = 0 ;

        for (int i = 0; i <A.length ; i++) {
            if (A[i] <= N){
                ctr[A[i]-1]++;
                if (ctr[A[i]-1] > max){
                    max = ctr[A[i]-1];
                }
            }
            else if (A[i] == N+1){
                Arrays.fill(ctr,max);
            }
        }

        return ctr;
    }
}
