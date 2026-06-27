package Task_A;

public class PracticeQuiz implements Exam {

    public String getType() {
        return "Practice Quiz";
    }

    public void displayInfo() {
        System.out.println("Type: " + getType());
        System.out.println("practice quiz is unlimited attempts");
    }


}
