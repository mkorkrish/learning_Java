public class ArrayExampleForEach {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Elements in the array: ");

        for (int num : numbers){
            System.out.println(num);
        }

        int sum = 0;
        for(int num:numbers)
        {
            sum += num;
        }

        System.out.println("Sum of all elements: " + sum);

        //MODIFY CODE


        int newValue = 25;
        int indextoModify = 1;

        for(int i = 0; i<numbers.length; i++)
        {
            if(i == indextoModify){
                numbers[i] = newValue;
                break;
            }
        }

        System.out.println("Modified array elements: ");
        for(int num: numbers)
        {
            System.out.println(num);
        }

    }
}
