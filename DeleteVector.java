import java.util.Vector;

public class DeleteVector {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        // Adding elements to the vector
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Original Vector: " + numbers);

        // Deleting an element at a specific index
        int indexToDelete = 4;
        numbers.remove(indexToDelete);

        System.out.println("Vector after deleting element at index " + indexToDelete + ": " + numbers);
    }
}
