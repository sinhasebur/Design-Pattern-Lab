import Task_A.*;
import Task_B.*;
import Task_C.*;
import Task_D.*;

public class Main {

    public static void main(String[] args) {

        Exam exam = new MidtermExamFactory().createExam();

        ExamConfiguration config = new ExamBuilder()
                .setTitle("OOP Midterm Exam")
                .setDuration(60)
                .setPassingScore(50)
                .enableNegativeMarking()
                .enableQuestionShuffle()
                .enableAutoSubmit()
                .build();

        QuestionSource source = new BankQuestionSource();

        QuestionFactory[] factories = {
                new MCQFactory(source),
                new MCQFactory(source),
                new EssayFactory(source),
                new ProgrammingFactory(source),
                new TrueFalseFactory(source)
        };

        System.out.println("==================================================");
        System.out.println("EXAM CREATED SUCCESSFULLY");
        System.out.println("==================================================");

        System.out.println("Type: " + exam.getType());
        System.out.println("Title: " + config.getTitle());
        System.out.println("Duration: " + config.getDuration() + " minutes");
        System.out.println("Passing Score: " + config.getPassingScore());

        System.out.println("\nConfiguration:");
        System.out.println("Negative Marking : " + config.hasNegativeMarking());
        System.out.println("Question Shuffle : " + config.hasQuestionShuffle());
        System.out.println("Auto Submit      : " + config.hasAutoSubmit());
        System.out.println("Calculator       : " + config.isCalculatorAllowed());

        System.out.println("\nQuestion Source: " + source.getSourceName());

        System.out.println("\nQuestions:");
        for (QuestionFactory factory : factories) {
            Question q = factory.createQuestion();
            System.out.println("- " + q.getType()
                    + " | Points: " + q.getPoints()
                    + " | Difficulty: " + q.getDifficulty());
        }

        System.out.println("==================================================");
    }
}