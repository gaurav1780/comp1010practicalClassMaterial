public class MyNumberStackClient {

    public static void main(String[] args) {
        String s = "3 6 4 - /";
        System.out.println(evaluate(s));

        s = "3 6 4 - / 7 *";
        System.out.println(evaluate(s));
    }

    public static boolean isOperation(String s) {
        return s.length() == 1 && "+-*/".indexOf(s) >= 0;
    }

    public static Double evaluate(String rpn) {
        String[] tokens = rpn.split(" ");
        MyNumberStack stk = new MyNumberStack();
        for (int i = 0; i < tokens.length; i++) {
            if (isOperation(tokens[i])) { // operator
                if (stk.isEmpty()) { // first operand not there
                    return null;
                }
                double top = stk.pop();
                if (stk.isEmpty()) { // second operand not there
                    return null;
                }
                double secondFromTop = stk.pop();

                // apply the right operation and push it back
                if (tokens[i].equals("+")) {
                    stk.push(secondFromTop + top);
                }
                if (tokens[i].equals("-")) {
                    stk.push(secondFromTop - top);
                }
                if (tokens[i].equals("*")) {
                    stk.push(secondFromTop * top);
                }
                if (tokens[i].equals("/")) {
                    stk.push(secondFromTop / top);
                }
            } else {
                stk.push(Double.parseDouble(tokens[i])); // we assume it's a number
            }
        }
        double top = stk.pop();
        if (stk.isEmpty()) {
            return top;
        } else {
            return null; // something left on the stack
        }
    }
}
