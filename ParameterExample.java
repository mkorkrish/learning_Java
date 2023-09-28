public class ParameterExample {
 
    //Formal Parameters
    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        //Actual parameters
        int result = add(5,7);
        System.out.println("Sum is: "+result);
    }
}
