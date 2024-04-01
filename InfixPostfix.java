import java.util.Stack;

class InfixPostfix {

    public String infixToPostfix(String infix){
        Stack<Character> st = new Stack<>();
        StringBuilder s = new StringBuilder();
        char next;
        for(char ch : infix.toCharArray()){
            switch (ch) {
                case '(':
                    st.push(ch);
                    break;
    
                case ')':
                    while ((next = st.pop()) != '(') {
                        s.append(next);
                    }
                    break;
    
                case '+':
                case '-':
                case '/':
                case '*':
                case '^':
                    while (!st.isEmpty() && precedence(st.peek()) >= precedence(ch)) {
                        s.append(st.pop());
                    }
                    st.push(ch);
                    break;
    
                default:
                    s.append(ch);
            }
        }

        while(!st.isEmpty()){
            s.append(st.pop());
        }
        return s.toString();
    }

    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
    
            case '*':
            case '/':
                return 2;
    
            case '^':
                return 3;
    
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
    	InfixPostfix i = new InfixPostfix();
        String infix = "(4+5 + 874 / 45 *851)- 54782 + 5*1";
        System.out.println("Infix :" + infix);
        System.out.println("Postfix :" + i.infixToPostfix(infix));
    }
}
