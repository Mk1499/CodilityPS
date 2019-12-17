import java.util.Stack ;

public class Brackets {

    public static void main(String[] args) {
        String S = "{[()()]}";
        System.out.println(solution(S));
    }
    public static int solution(String S) {
        int state = 1 ;
        if (S.length() == 0 )
            return 1 ;
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < S.length() ; i++) {
            if (S.charAt(i) == '[' || S.charAt(i) == '{' || S.charAt(i) == '('   )
                stack.push(S.charAt(i));
            else {
                if (stack.size() == 0 )
                    return 0;
                char last = stack.pop();

                if (! isValidPair(last,S.charAt(i)))
                    return 0;


            }
        }
        return stack.size() != 0 ? 0 : 1  ;
    }

    public static boolean isValidPair(char left ,char right){
        System.out.println("L : "+left);
        System.out.println("R : "+right);


        if (left == '{' && right == '}')
            return true;
        else if (left == '(' && right == ')')
            return true;
        else if (left == '[' && right == ']')
            return true;

        return false ;
    }
}
