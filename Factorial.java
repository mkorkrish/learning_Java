public class Factorial{
    public static long factorial(int n){
        if(n==0){
            return 1;
        } else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        int number = 5;
        System.out.println("Factorial of " + number + " is "+ factorial(number));
    }
}