public class SumOfArrayElements{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int i = 0; i<numbers.length; i++){
            sum += numbers[i];
            // 0 + 1 = 1
            // 1+ 2 = 3
            // 3 + 3 = 6
            //6 + 4 = 10
            // 10 + 5 = 15

        }
    }
}