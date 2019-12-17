import  java.util.Scanner ;

public class Iterators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num ;
        System.out.println("Enter Number");
        num = in.nextInt();
        System.out.println(solution(num));
    }

    public static int solution (int N){
        int max = 0,counter=0 ;

        String binary = Integer.toBinaryString(N);
         boolean start = false ;
        for (int i = 0; i <binary.length() ; i++) {

            if (binary.charAt(i) == '1' && !start){
                start=true;
            }
            else if (binary.charAt(i)=='0' ){
                counter++;
            }

             if (binary.charAt(i) == '1' && start){
                start = false ;
                if (counter > max){
                    max = counter ;
                }
                counter = 0 ;
            }

            }


        return  max ;
    }
}
