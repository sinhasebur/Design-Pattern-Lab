package Task_A;

public class Main {

    public static void main(String[] args) {

        ExamFactory factory = new MidtermExamFactory();
        Exam exam = factory.createExam();
        exam.displayInfo();
    }
}