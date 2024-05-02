public class ReverseArrayElements {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        System.out.println("Array Elements in reverse order:");

        for(int i = names.length - 1; i>=0; i--){
            System.out.println(names[i]);

            //Length = 4 - 1 = 3 >0
            //names[3] = David
            //names[2], 1, 0 = Charlie

        }
    }
}
