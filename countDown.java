public static int countDown(int n){
    if(n==0){ //base case
    System.out.println("Go!");
    return 0;
    } else { //recursive
        System.out.println(n);
        return coundDown(n-1);
    }
}