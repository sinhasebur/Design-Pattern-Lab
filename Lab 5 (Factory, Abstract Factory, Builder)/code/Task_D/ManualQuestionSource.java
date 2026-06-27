package Task_D;

import Task_B.*;

public class ManualQuestionSource implements QuestionSource {

    @Override
    public Question getQuestion(String type) {

        if (type.equalsIgnoreCase("MCQ")) {
            return new MCQQuestion("What is the Capital of Bangladesh?", 2, "Easy");
        }

        if (type.equalsIgnoreCase("Essay")) {
            return new EssayQuestion("Explain Code Smells", 10, "Medium");
        }

        if (type.equalsIgnoreCase("Programming")) {
            return new ProgrammingQuestion("Write Java code for matrix multiplication using multithreading", 20, "Hard");
        }

        if (type.equalsIgnoreCase("TrueFalse")) {
            return new TrueFalseQuestion("Java is platform independent", 1, "Easy");
        }

        throw new IllegalArgumentException("Unknown question type " + type);
    }

    @Override
    public String getSourceName() {
        return "Manual Mode";
    }
}