import java.util.*;
class TreeNode {
    String value;
    TreeNode left;
    TreeNode right;
    public TreeNode(String value) 
    {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
class InfixToPostfixConverter 
{
    public static String convert(String infixExpression) 
    {
        // Placeholder implementation for demonstration purposes
        return "34+52-*";  // This represents the postfix equivalent of (3+4)*(5-2)
    }
}
public class ExpressionTreeEvaluator {
    public static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    public static int evaluateOperator(int leftOperand, int rightOperand, String operator) {
        switch (operator) {
            case "+":
                return leftOperand + rightOperand;
            case "-":
                return leftOperand - rightOperand;
            case "*":
                return leftOperand * rightOperand;
            case "/":
                return leftOperand / rightOperand;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    public static TreeNode buildExpressionTree(String postfixExpression) {
        Stack<TreeNode> stack = new Stack<>();

        for (char c : postfixExpression.toCharArray()) {
            String token = String.valueOf(c);
            if (!isOperator(token)) {
                stack.push(new TreeNode(token));
            } else {
                TreeNode rightOperand = stack.pop();
                TreeNode leftOperand = stack.pop();
                TreeNode operatorNode = new TreeNode(token);
                operatorNode.left = leftOperand;
                operatorNode.right = rightOperand;
                stack.push(operatorNode);
            }
        }
        return stack.pop();
    }
    public static int evaluateExpressionTree(TreeNode root) {
        if (root == null)
            return 0;

        if (!isOperator(root.value)) {
            return Integer.parseInt(root.value);
        } else {
            int leftValue = evaluateExpressionTree(root.left);
            int rightValue = evaluateExpressionTree(root.right);
            return evaluateOperator(leftValue, rightValue, root.value);
        }
    }
    public static void main(String[] args) {
        String infixExpression = "(3+4)*(5-2)";
        // Convert infix expression to postfix (placeholder implementation)
        String postfixExpression = InfixToPostfixConverter.convert(infixExpression);
        // Build binary expression tree from postfix expression
        TreeNode root = buildExpressionTree(postfixExpression);
        // Evaluate the expression tree
        int result = evaluateExpressionTree(root);
        System.out.println("Result: " + result);  // This should print "Result: 21"
    }
}