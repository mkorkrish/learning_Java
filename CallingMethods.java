public class CallingMethods {
 
    public static void staticMethod(){
        System.out.println("Calling static method.");
    }

    public void instanceMethod(){
        System.out.println("Calling instance method.");
    }

    public static void main(String[] args){
        //call static
        staticMethod();

        //call instance
        CallingMethods obj = new CallingMethods();
        obj.instanceMethod();
    }
}
