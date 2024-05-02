public class SumArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,92018490};
        int sum = 0;

        for(int number: numbers){
            sum+=number;
        }

        System.out.println("Sum of array elemen: " + sum);

    }
}
