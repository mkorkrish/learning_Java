public class Fibonacci {
    public static long fibonacci(int n){
        if (n<=1){
            return n;
        } else {
            return fibonacci(n-1) + fibonacci (n-2);
        }
    }

    public static void main (String[] args){
        int n=10;
        System.out.println("Fibonacci number at position " + n + " is " fibonacci(number));
    }
}