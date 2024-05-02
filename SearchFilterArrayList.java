import java.util.ArrayList;
import java.util.stream.Collectors;

public class SearchFilterArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        if (numbers.contains(30)){
            System.out.println("Found the element");
        }

            else{
                System.out.println("Element not found");
            }


        }
    }
