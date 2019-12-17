import java.util.Arrays ;
public class UnPaired {

    public static void main(String[] args) {
        int [] arr = {3,4,3,7,4,7,9};
        System.out.println(solution((arr)));
    }

    public static int solution(int [] A){

        Arrays.sort(A);
        for (int i = 0; i < A.length-1; i++) {
//            System.out.println(A[i]);
            if (A[i] != A[i+1] && i%2 == 0){
                return A[i];
            }
        }

        return A[A.length-1];
    }

}
