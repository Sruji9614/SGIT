public class StackUsingArray 
{
    private int maxSize; // Maximum size of the stack
    private int top;            // Index of the top element
    private int[] stackArray;   // Array to hold stack elements
    public StackUsingArray(int size) 
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Initialize top as -1 to indicate an empty stack
        // Stack is initially empty
    }
    //Implemented Push Operation (Adding an Element)
    public void push(int value) 
    {
        if (top < maxSize - 1) {   // Check if the stack is not full
        top++;                  // Increment top
        stackArray[top] = value; // Add the element to the stack
            System.out.println("Pushed " + value + " onto the stack.");
        } else 
        {
            System.out.println("Stack is full. Cannot push " + value + ".");
        }
    }
    //implemented pop operation(removing an elements)
    public int pop() 
    {
        if (top >= 0) //check if the stack is not empty
        {
            int poppedValue = stackArray[top--];//get the top element and decrement the top
            System.out.println("Popped " + poppedValue + " from the stack.");
            return poppedValue;//return the popped element
        } else 
        {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; //return a dummy data indicating failure
            // You can define your own error value
        }
    }
       //implemented peek operation for viewing the top elements
    public int peek() 
    {
        if (top >= 0) 
        {
            System.out.println("Peeked " + stackArray[top] + " from the stack.");
            return stackArray[top];// Return the top element without removing it
        } else 
        {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;  // Return a dummy value indicating failure
            // You can define your own error value
        }
    }
    //Implement isEmpty and is Full Methods
    public boolean isEmpty() 
    {
        return top == -1;// Stack is empty if top is -1
    }

    public boolean isFull() 
    {
        return top == maxSize - 1;// Stack is full if top is at the last index
    }
//Now in main method we are going to intialize the push,pop,peek values.
    public static void main(String[] args) 
    {
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();

        stack.push(40);

        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}