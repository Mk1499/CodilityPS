public class MaxSlice {
    public static void main(String[] args) {

        int [] A = {-10,1};
        System.out.println(solution(A));
    }
    public static int solution(int [] A){
        int maxEnding = A[0] ,maxSlice = A[0] ;

        for(int i = 1 ; i < A.length ; i++){
            if (maxEnding < maxEnding + A[i])
                maxEnding += A[i];
            else
                maxEnding = A[i]  ;

            if (maxSlice < maxEnding)
                maxSlice = maxEnding ;
        }
        return maxSlice ;
    }
}
