import java.lang.reflect.Array;

public class CyclicRotation {

    public static void main(String[] args) {
        int [] A = {};
        int K = 3;
        int[] rslt = solution(A,K);
        for (int i = 0; i <rslt.length ; i++) {
            System.out.print(rslt[i]+",");

        }
    }

    public static int[] solution(int[] A, int K) {

        int [] rslt = new int[A.length];
        if (A.length > 0 ){
            int noOfShifts = A.length - (K % A.length )  ;
//        System.out.println("KKK "+noOfShifts);
            for (int i = 0; i <rslt.length ; i++) {
                if (i+noOfShifts < rslt.length){
                    rslt[i] = A[i+noOfShifts];
                }else{
                    rslt[i] = A[(noOfShifts+i)-A.length];
                }
            }
        }

        return  rslt;
    }
}
