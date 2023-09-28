public class InstanceExample {
    String message = "Hello";

    public void display(){
    System.out.println(message+ ", this is an instance method.");
    }

    public static void main(String[] args){
        InstanceExample obj = new InstanceExample();
        obj.display();
    }
}


//Instance
//Create obj and referencing new [classname]
//obj.display()
