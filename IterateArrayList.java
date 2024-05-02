import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Iterator;

public class IterateArrayList {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        for(int i = 0;i<animals.size(); i++){
            System.out.println(animals.get(i));
        }

        for(String animal : animals){
            System.out.println(animal);
        }

    }
}
