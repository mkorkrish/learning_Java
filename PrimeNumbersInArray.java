public class PrimeNumbersInArray {
    public static void main(String[] args) {
        int[] numbers = {7, 12, 23, 4, 17, 8, 29, 10, 31};
        System.out.println("Prime numbers in the array:");
       
        // Loop through each element in the 'numbers' array
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];  // Get the current element from the array
            boolean isPrime = true;  // Assume the number is prime by default
            if (num <= 1) {
                isPrime = false;  // If the number is less than or equal to 1, it's not prime
            } else {
                // Check for factors of the number from 2 to the square root of the number
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;  // If a factor is found, the number is not prime
                        break;  // Exit the loop early, as we already determined it's not prime
                    }
                }
            }
            // If 'isPrime' is still true, then the number is prime, so print it
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
