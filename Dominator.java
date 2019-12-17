import java.util.Arrays;

public class Dominator {

    public static void main(String[] args) {
        int[] arr= {3,4,3,2,3,-1,3,3};
        System.out.println(solution(arr));
    }

    public static int solution(int [] A){

        int dom=-1;
        int [] arr = new int [A.length];
        for (int i = 0; i < A.length; i++) {
            arr[i] = A[i];
        }
        if (A.length == 0 )
        return -1 ;

        int count=0;
        Arrays.sort(A);
        for (int i = 0; i <A.length ; i++) {
            if (A[i] == A[A.length/2]){
                count++;
            }

        }
        if (count > A.length/2)
               dom = A[A.length/2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dom)
                return i ;
        }
       return -1;
    }
}
