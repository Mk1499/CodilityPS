import java.util.Stack;

public class Nesting {


    public static void main(String[] args) {
        String s = "((((())))())";
        System.out.println(solution(s));
    }

    public static int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<Character>();
        if (S.length() % 2 != 0 ){
            return 0 ;
        }
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(')
                stack.push(S.charAt(i));
            else {
                if (stack.size() == 0 )
                    return 0 ;
               stack.pop();

            }


        }
        return stack.size() > 0 ? 0 : 1 ;

    }
}