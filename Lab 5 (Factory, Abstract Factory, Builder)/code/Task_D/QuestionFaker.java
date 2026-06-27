package Task_D;

import Task_B.*;

public class QuestionFaker {

    public Question generateQuestion(String type) {
        if (type.equalsIgnoreCase("MCQ")) {
            return new MCQQuestion("Auto-generated.", 2, "Medium");
        }

        if (type.equalsIgnoreCase("Essay")) {
            return new EssayQuestion("Auto-generated", 10, "Hard");
        }

        if (type.equalsIgnoreCase("Programming")) {
            return new ProgrammingQuestion("Auto-generated", 20, "Hard");
        }

        if (type.equalsIgnoreCase("TrueFalse")) {
            return new TrueFalseQuestion("Auto-generated", 1, "Easy");
        }

        throw new IllegalArgumentException("Unknown question type: " + type);
    }
}