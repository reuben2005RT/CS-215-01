package Homework2;

public class WFP {

    public static int WFP(String exp) {
        Ar_Stack<Character> stack = new Ar_Stack<Character>();
        int count = 0;

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (c == '(' | c == '[' || c == '{') {
                stack.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return -1;
                }

                char top = stack.top();
                stack.pop();

                if (!matches(top, c)) {
                    return -1;
                }

                count++;
            }
        }

        if (!stack.isEmpty()) {
            return -1;
        }

        return count;
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (opan == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}

