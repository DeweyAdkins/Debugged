package org.example;

public class AverageCalculator {

    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        double sum = 0.0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        // Test case
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            double average = calculateAverage(numbers);
            System.out.println("Average: " + average); // Expected output: 3.0

            // Introducing a NullPointerException
            int[] nullArray = null;
            calculateAverage(nullArray);

            // Introducing an ArrayIndexOutOfBoundsException
            int[] emptyArray = {};
            calculateAverage(emptyArray);

            // Introducing a logic error (wrong calculation)
            System.out.println("Average with logic error: " + calculateAverageWithLogicError(numbers));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method with logic error for demonstration
    public static double calculateAverageWithLogicError(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        double sum = 0.0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / (numbers.length + 1); // Intentional logic error
    }
}

