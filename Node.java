public class Node
{
    public static void main(String[] args) 
    {
         int findMax() {
        if (head == null) {
            throw new IllegalStateException("The linked list is empty.");
        }

        int max = head.data;
        Node current = head.next;

        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }

        return max;
    }
int findMin() 
{
        if (head == null) 
        {
            throw new IllegalStateException("The linked list is empty.");
        }

        int min = head.data;
        Node current = head.next;

        while (current != null) 
        {
            if (current.data < min) 
            {
                min = current.data;
            }
            current = current.next;
        }

        return min;
}

        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(5);
        linkedList.insert(25);
        linkedList.insert(15);
        linkedList.insert(30);

        linkedList.display();

        int max = linkedList.findMax();
        int min = linkedList.findMin();

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}