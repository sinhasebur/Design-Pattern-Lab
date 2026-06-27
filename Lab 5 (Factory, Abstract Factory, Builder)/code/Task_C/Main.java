package Task_C;

public class Main {

    public static void main(String[] args) {

        ExamConfiguration config = new ExamBuilder()
                .setTitle("OOP Midterm Exam")
                .setDuration(60)
                .setPassingScore(50)
                .enableNegativeMarking()
                .enableQuestionShuffle()
                .enableAutoSubmit()
                .build();

        config.displayConfiguration();
    }
}