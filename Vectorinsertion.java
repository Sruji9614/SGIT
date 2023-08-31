import java.util.Vector;

public class Vectorinsertion {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        // Adding elements to the vector
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original Vector: " + numbers);

        // Inserting an element at a specific index
        int elementToInsert = 25;
        int indexToInsert = 2;
        numbers.add(indexToInsert, elementToInsert);

        System.out.println("Vector after inserting " + elementToInsert + " at index " + indexToInsert + ": " + numbers);
    }
}
