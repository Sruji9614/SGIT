import java.util.Stack;
public class DisplayStackContents {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // Convert char to int
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }

            // Display stack contents
            displayStackContents(stack);
        }

        return stack.pop();
    }

    public static void displayStackContents(Stack<Integer> stack) {
        System.out.print("Stack contents: ");
        for (int value : stack) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String postfixExpression = "34+5*";
        int result = evaluatePostfix(postfixExpression);
        System.out.println("Result: " + result); // Output: Result: 35
    }
}
