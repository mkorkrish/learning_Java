public class Test {
    public static void display() {
        System.out.println("Static display.");
    }

    public void show() {
        System.out.println("Instance show.");
    }

    public static void main(String[] args){
        Test.display();
        Test obj = new Test();
        obj.show();
    }
}