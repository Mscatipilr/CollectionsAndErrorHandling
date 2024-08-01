import java.util.Set;

class Math {
    private Set<Integer> integerSet;

    // Constructor that accepts a Set of integers
    public Math(Set<Integer> integerSet) {
        this.integerSet = integerSet;
    }

    // Method to calculate sum
    public int calculateSum() throws IllegalArgumentException {
        if (integerSet == null || integerSet.isEmpty()) {
            throw new IllegalArgumentException("Set of integers cannot be null or empty.");
        }

        int sum = 0;
        for (int num : integerSet) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate average
    public double calculateAverage() throws ArithmeticException {
        if (integerSet == null || integerSet.isEmpty()) {
            throw new ArithmeticException("Cannot calculate average of an empty set.");
        }

        int sum = calculateSum();
        return (double) sum / integerSet.size();
    }
}
