public class Riddle {

    // Instance variables for Riddle's question and answer
    private String question;
    private String answer;

    // Constructor
    public Riddle(String initQuestion, String initAnswer) {
        question = initQuestion;
        answer = initAnswer;
    }

    // Print riddle question
    public void printQuestion() {
        System.out.println(question); // Use the instance variable instead of hardcoded string
    }

    // Print riddle answer
    public void printAnswer() {
        System.out.println(answer); // Use the instance variable instead of hardcoded string
    }

    // Main method for testing
    public static void main(String[] args) {
        Riddle chickenRiddle = new Riddle("Why did the chicken cross the playground?", "To get to the other side!");
        
        chickenRiddle.printQuestion(); // Call the methods on the instance
        chickenRiddle.printAnswer();   // Call the methods on the instance
    }
}
