import java.util.ArrayList;

class Student{
    String name;
    int age;


Student(String name, int age){
    this.name = name;
    this.age = age;
}

@Override
public String toString(){
    return name + " " +  age + "years old";
}

}
public class CustomObjectArrayList {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student ("Jack", 18));
    students.add(new Student ("Bob", 24));
  }  
}
