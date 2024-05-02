import java.util.ArrayList;

public class AccessModifyArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original list: " + colors);

        //Access and Modify
        String element = colors.get(1); //Green
        System.out.println("Element at index 1: "+element);
        colors.set(1,"Yellow"); //Green -> Yellow

        colors.remove("Blue"); //Removed Blue
        colors.remove(0); //Removed Red

        System.out.println("Modified list: "+ colors);
    }

}
