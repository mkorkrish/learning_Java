public class ReverseArrayExample {
    public static void main(String[] args) {
        int[] numbers = {4,7,20,60,70};

        for(int i = 0; i<numbers.length/2; i++){

            //Swap the element
            int temp = numbers[i]; //temp = 4
            numbers[i] = numbers[numbers.length - 1-i]; //numbers[0] = numbers[4] (4 became 70)
            numbers[numbers.length-1-i] = temp; //numbers[4] = 4 (70 became 4)
        }

        for(int item:numbers){
            //value of each element throughout the whole index
            System.out.println(item + " ");
        }
    }
}
