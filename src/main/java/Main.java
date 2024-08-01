import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Define a list of integers with duplicates
        List<Integer> integers = new ArrayList<>();
        integers.add(67);
        integers.add(42);
        integers.add(43);
        integers.add(12);
        integers.add(23);
        integers.add(42);

        try {
            // Remove duplicates using a Set
            Set<Integer> setIntegers = new HashSet<>(integers);
            System.out.println("List without duplicates: " + setIntegers);

            // Calculate sum and average
            Math math = new Math(setIntegers);
            int sum = math.calculateSum();
            double average = math.calculateAverage();

            // Print the results
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }
    }
}

