package stackcode;

public class BracketCheck {
    public static boolean check(String exp)
    {
        Stack s = new Stack();
        for(int i = 0; i < exp.length(); i++)
        {
            char c = exp.charAt(i);
            if(c == '(')            //add all the open brackets to a stack
            s.push(c);
            else if(c == ')')
                if(s.isEmpty())     //if stack is empty we can't use pop so we return false
                return false;
                else
                s.pop();            //When we find a closed bracket we pop one of the opening brackets
        }
        return s.isEmpty();         //if the stack is empty it means that all the brackets cancel each other out and are balanced
    }
    
    public static void main(String[] args) {
        String expression1 = "(((a+b)*c)+(u*v))";
        String expression2 = "(a+b)*c)";
        String expression3 = "(a+b)*)c+b(";
        String expression4 = "a + (2b + (d))";
        
        System.out.println(check(expression1)); // true
        System.out.println(check(expression2)); // false
        System.out.println(check(expression3)); // false
        System.out.println(check(expression4)); // true
    }
}
