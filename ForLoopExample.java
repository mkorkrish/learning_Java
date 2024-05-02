public class ForLoopExample{
    public static void main(String[] args){

        int[] array = new int[5];

        for(int i=0; i<array.length; i++){
            array[i]=i*2;
            //Array value = 2*index value
        }

        for(int i = 0; i<array.length; i++){
            System.out.println("Element at index "+i+": " + array[i]);
        }

    }
}

//Needed element at specific index