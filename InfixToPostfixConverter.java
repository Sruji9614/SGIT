 import java.util.Stack;
public class InfixToPostfixConverter 
{
     //  Helper function to determine the precedence of operators
    private static int getPrecedence(char operator) 
    {
        switch (operator) 
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String infixExpression) 
    {
        StringBuilder postfixExpression = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();
        for (char c : infixExpression.toCharArray()) 
        {
            if (Character.isLetterOrDigit(c)) 
            {
                postfixExpression.append(c);
            }
             else if (c == '(') 
             {
                operatorStack.push(c);
            } 
            else if (c == ')') 
            {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') 
                {
                    postfixExpression.append(operatorStack.pop());
                }
                operatorStack.pop(); // Pop the '('
            } 
            else { 
                // Operator
                while (!operatorStack.isEmpty() && getPrecedence(c) <= getPrecedence(operatorStack.peek())) {
                    postfixExpression.append(operatorStack.pop());
                }
                operatorStack.push(c);
            }
        }

        while (!operatorStack.isEmpty()) 
        {
            postfixExpression.append(operatorStack.pop());
        }

        return postfixExpression.toString();
    }

    public static void main(String[] args) 
    {
        String infixExpression = "A + B * C - D / E";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}
