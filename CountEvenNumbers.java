public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 23, 14, 7, 8};
        int evenCount = 0;
        
        for (int i = 0; i<numbers.length;i++){
            if (numbers[i] % 2 == 0) {
                evenCount++;

                //10 % 2 = 0; 0+1;
                //23 % 2 != 0; 1;
                //14 % 2 = 0 ; 2
                //7 % 2 != 0; 2
                // 8 % 2 = 0; 3

            }
        }
    }
}

