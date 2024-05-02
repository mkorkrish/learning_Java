public class Values {
    private int[] numbers; // Instance variable to hold the array of integers

    // Constructor that initializes the array to a specific length
    public Values(int size) {
        numbers = new int[size]; // Initialize the array with the given size
    }

    // No-argument constructor that does not initialize the array
    public Values() {
        // Purposefully left empty to demonstrate the requirement
    }

    // Method to set the numbers in the array from user input
    public void setNums(int[] nums) {
        // Assuming nums is already provided with values
        this.numbers = nums; // Set the instance variable to the provided array
    }

    // Method to retrieve the array of numbers
    public int[] getNums() {
        return numbers; // Return the instance variable array
    }

    // Method to sum all numbers in the array
    public int sumAll() {
        int sum = 0;
        for (int num : numbers) {
            sum += num; // Add each number to the sum
        }
        return sum; // Return the total sum
    }

    // Method to find the sum of only odd numbers in the array
    public int oddsOnly() {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 != 0) { // Check if the number is odd
                sum += num; // Add it to the sum
            }
        }
        return sum; // Return the sum of odd numbers
    }

    // Method to find the sum of numbers less than a specific value
    public int lessThanLast() {
        int sum = 0;
        int lastValue = numbers[numbers.length - 1]; // Get the last number in the array
        for (int num : numbers) {
            if (num < lastValue) { // If number is less than the last value
                sum += num; // Add it to the sum
            }
        }
        return sum; // Return the sum
    }

    // Method to calculate the average of the numbers in the array
    public double average() {
        return (double) sumAll() / numbers.length; // Use the sumAll method to get the sum and divide by the array length
    }

    // Method to count how many times the first element is repeated in the array
    public int firstRepeats() {
        int count = 0;
        int firstValue = numbers[0]; // Get the first number
        for (int num : numbers) {
            if (num == firstValue) { // If the current number is equal to the first number
                count++; // Increment the count
            }
        }
        return count; // Return the count of repeats
    }

    // Method to find the smallest number in the array
    public int findSmallest() {
        int smallest = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < smallest) { // If current number is smaller than smallest found so far
                smallest = num; // Update smallest
            }
        }
        return smallest; // Return the smallest number
    }

    // Method to find the largest number in the array
    public int findLargest() {
        int largest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > largest) { // If current number is larger than largest found so far
                largest = num; // Update largest
            }
        }
        return largest; // Return the largest number
    }

    // Overridden toString method to represent the state of the Values object
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            if (i < numbers.length - 1) {
                sb.append(", "); // Add a comma between numbers
            }
        }
        sb.append("]");
        return sb.toString(); // Return the string representation of the array
    }
}

