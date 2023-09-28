class Rectangle {
    double width;   // Instance variable for the rectangle's width
    double height;  // Instance variable for the rectangle's height

    // Default constructor
    Rectangle() {
        this(1.0, 1.0);  // Chaining to the parameterized constructor
    }

    // Parameterized constructor
    Rectangle(double width, double height) {
        this.width = width;    // Initializing width with provided value
        this.height = height;  // Initializing height with provided value
    }

    // Method to calculate area of the rectangle
    double area() {
        return width * height;
    }
}

public class Main3{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();          // Using default constructor
        System.out.println("Area of rect1: " + rect1.area());  // Displays: "Area of rect1: 1.0"

        Rectangle rect2 = new Rectangle(3, 4);      // Using parameterized constructor
        System.out.println("Area of rect2: " + rect2.area());  // Displays: "Area of rect2: 12.0"
    }
}
