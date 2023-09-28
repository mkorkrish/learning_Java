class Person {
    String name; //Instance Variable for the Person's name
    int age; //Instance Variable for the person's age

    //Copy constructor
    Person(Person other){
        this.name = other.name; //Copy the name from other object
        this.age = other.age; //Copy the age from another object
    }



    //Default Constructor
    Person(){
        this.name = "Unknown"; //Setting default name
        this.age = 0; //Setting default age
    }

    //Parameter Constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    void display()
    {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Main{
    public static void main(String[] args){

        Person original = new Person("Jane",30); //Original Person Object

        Person copy = new Person(original);

        copy.display();

        Person person1 = new Person(); //Using our default constructor
        person1.display();

        Person person2 = new Person("John", 25);
        person2.display();
    }
}