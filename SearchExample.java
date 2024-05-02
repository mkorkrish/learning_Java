public class SearchExample {
    public static void main(String[] args) {
        int[] numbers = {34,78,23,89,51,19,83,99};
        int target = 89; //What we want to look for
        boolean found = false;

        for(int number:numbers){
            if(number == target){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println(target + " was found in the array");
        }

    }
}
