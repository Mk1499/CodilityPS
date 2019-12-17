public class CountDiv {
    public static void main(String[] args) {
        System.out.println(solution(0,0,11));
    }

    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int divCounts = 0 ,num ;
//        for (int i = A; i <= B; i++) {
//            if (i % K == 0 && i !=0 )
//                divCounts++;
//        }
        num = (B - A + 2) % K ;
        num = (B - A + 2 ) - num ;
        divCounts = num / K ;
        return divCounts ;
    }
}
