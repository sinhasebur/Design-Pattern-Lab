package Task_D;

import Task_B.*;

import java.util.Random;

public class QuestionBank {

    private final Random random = new Random();

    private final Question[] mcqQuestions = {
            new MCQQuestion("Which code smell describes a method that is too long and tries to do too much?", 2, "Medium"),
            new MCQQuestion("What smell is a class has too many responsibilities?", 2, "Easy")
    };

    private final Question[] essayQuestions = {
            new EssayQuestion("Explain the 'Duplicate Code' smell and suggest at least two refactoring techniques to eliminate it.", 10, "Hard"),
            new EssayQuestion("What is 'Feature Envy'? Describe a typical scenario and how to refactor it.", 10, "Hard")
    };

    private final Question[] programmingQuestions = {
            new ProgrammingQuestion("Given a long method that prints a report, extracts data, and formats output, refactor it into smaller methods with clear responsibilities.", 20, "Hard"),
            new ProgrammingQuestion("Write a simple Java class that demonstrates 'Primitive Obsession', then refactor it by introducing appropriate value objects.", 20, "Medium")
    };

    private final Question[] trueFalseQuestions = {
            new TrueFalseQuestion("A method with more than 10 parameters is generally considered a code smell.", 1, "Easy"),
            new TrueFalseQuestion("Using clear and concise comments to explain complex logic is always a code smell.", 1, "Medium")
    };

    public Question getRandomQuestion(String type) {
        if (type.equalsIgnoreCase("MCQ")) {
            return mcqQuestions[random.nextInt(mcqQuestions.length)];
        }

        if (type.equalsIgnoreCase("Essay")) {
            return essayQuestions[random.nextInt(essayQuestions.length)];
        }

        if (type.equalsIgnoreCase("Programming")) {
            return programmingQuestions[random.nextInt(programmingQuestions.length)];
        }

        if (type.equalsIgnoreCase("TrueFalse")) {
            return trueFalseQuestions[random.nextInt(trueFalseQuestions.length)];
        }

        throw new IllegalArgumentException("Unknown question type: " + type);
    }
}