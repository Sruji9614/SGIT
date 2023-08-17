//Create a Node Class
class Node 
{
    int data;
    Node next;
    public Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}
// Create a Linked List Class
public class StackUsingLinkedList 
{
    private Node top;// Reference to the top node of the stack
    public StackUsingLinkedList() 
    {
        top = null; // Initialize the stack as empty
        // Stack is initially empty
    }
    //Implement Push Operation (Adding an Element)
    public void push(int value) 
    {
        Node newNode = new Node(value);
        newNode.next = top; // Make the new node point to the current top
        top = newNode; // Update top to the new node
        System.out.println("Pushed " + value + " onto the stack.");
    }
    //implementing pop operation(removing an element)
    public int pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a dummy value indicating failure
            // You can define your own error value
        }
        int poppedValue = top.data; // Get the value of the top node
        top = top.next; // Update top to the next node
        System.out.println("Popped " + poppedValue + " from the stack.");
        return poppedValue; // Return the popped value
    }
    //implementing peek operation to view the top element
    public int peek() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a dummy value indicating failure
        }
        System.out.println("Peeked " + top.data + " from the stack.");
        return top.data; // Return the value of the top node without removing it
    }
    public boolean isEmpty() 
    {
        return top == null;// Stack is empty if top is null
    }
    //in main method we have initiated our values
    public static void main(String[] args) 
    {
        StackUsingLinkedList stack = new StackUsingLinkedList();
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
