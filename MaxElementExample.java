public class MaxElementExample {
    public static void main(String[] args) {
        int[] numbers = {6,7,9,10,12,13,1908};
        int max = numbers[0];

        for(int i = 1; i <numbers.length; i++){
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("max value: " +max);
    }
}
