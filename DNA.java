public class DNA {

    public static void main(String[] args) {

        String s = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        int [] arr = solution(s,P,Q);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }


    }

    public static  int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] arr = new int [P.length];
        int min=5  ;
        for (int i = 0; i <P.length ; i++) {
            for (int j = P[i]; j <=Q[i] ; j++) {
                switch (S.charAt(j)){
                    case 'A':
                        min=1 ;
                        break;
                    case 'C':
                        if(min > 2)
                            min=2;
                        break;
                    case 'G':
                        if(min > 3)
                            min=3;
                        break;
                    case 'T':
                        if(min > 4) {
                            min=4;
                        }
                        break;

                }
            }
            arr[i]=min;
            min =5;
        }
        return arr ;
    }
}
